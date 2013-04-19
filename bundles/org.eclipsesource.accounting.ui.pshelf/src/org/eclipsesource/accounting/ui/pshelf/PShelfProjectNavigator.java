package org.eclipsesource.accounting.ui.pshelf;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.internal.ui.util.ECPHandlerHelper;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.ecp.spi.ui.UIProvider;
import org.eclipse.emf.ecp.spi.ui.UIProviderRegistry;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.nebula.widgets.pshelf.PShelf;
import org.eclipse.nebula.widgets.pshelf.PShelfItem;
import org.eclipse.nebula.widgets.pshelf.RedmondShelfRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;

@SuppressWarnings("restriction")
public class PShelfProjectNavigator {

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	public PShelfProjectNavigator() {
	}

	public void createContent(final Composite parent,final ECPProject project) {
		GridLayoutFactory.fillDefaults().numColumns(1).applyTo(parent);
		final PShelf shelf = new PShelf(parent, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(shelf);
		// Optionally, change the renderer
		shelf.setRenderer(new RedmondShelfRenderer());
		Map<EClass,EObject> eClasses=getTopLevelEClasses((InternalProject) project);
		

		for (Object object : project.getElements()) {
			EObject eObject=(EObject)object;
			if (eClasses.containsKey(eObject.eClass())){
				eClasses.put(eObject.eClass(),eObject);
			}
		}

		for(EClass clazz:eClasses.keySet()){
			PShelfItem item = new PShelfItem(shelf, SWT.NONE);
			item.setText(clazz.getName());
			item.getBody().setLayout(new FillLayout());
			{
				EObject eObject=eClasses.get(clazz);
				if(eObject==null){
					eObject=EcoreUtil.create(clazz);
					addObjectToProject(project,eObject);
					
				}
				createTreeViewer(item.getBody(), eObject,(InternalProject)project);
			}
		}
		
		shelf.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseUp(MouseEvent e) {
				super.mouseUp(e);
				Tree tree=(Tree)shelf.getSelection().getBody().getChildren()[0];
				tree.deselectAll();
			}
			
		});
	}

	private void addObjectToProject(final ECPProject project, final EObject eObject) {
		EditingDomain editingDomain=project.getEditingDomain();
		editingDomain.getCommandStack().execute(new ChangeCommand(eObject) {
			
			@Override
			protected void doExecute() {
				project.getElements().add(eObject);
			}
		});
	}

	private Map<EClass,EObject> getTopLevelEClasses(InternalProject project) {
		Map<EClass,EObject> result=new LinkedHashMap<>();
		for(EPackage ePackage:project.getVisiblePackages()){
			for(EClassifier classifier:ePackage.getEClassifiers()){
				EAnnotation annotation=classifier.getEAnnotation("org.eclipse.emf.ecp.navigator");
				if(annotation==null)
					continue;
				result.put((EClass)classifier, null);
			}
		}
		for(EClass clazz:project.getVisibleEClasses()){
			EAnnotation annotation=clazz.getEAnnotation("org.eclipse.emf.ecp.navigator");
			if(annotation==null)
				continue;
			result.put(clazz, null);
		}
		return result;
	}

	private void createTreeViewer(Composite parent, EObject object,final InternalProject project) {
		TreeViewer tv = new TreeViewer(parent);
		tv.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		tv.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		tv.setInput(object);
		createContextMenu(tv, object,project);
		tv.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				EObject selection=(EObject) ((IStructuredSelection)event.getSelection()).getFirstElement();
				if(selection!=null)
					ECPHandlerHelper.openModelElement(selection , project);
			}
		});
	}
	private final Set<MenuRegisterBean> menus=new HashSet<>();
	public Set<MenuRegisterBean> getMenus() {
		return menus;
	}

	private void createContextMenu(final TreeViewer tv,
			final EObject parentObject,final InternalProject project) {
		Control control = tv.getControl();
		
		MenuManager manager = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		manager.setRemoveAllWhenShown(true);
		
		manager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				EObject selection = (EObject) ((IStructuredSelection) tv
						.getSelection()).getFirstElement();
				if (selection == null)
					selection = parentObject;
				UIProvider provider = UIProviderRegistry.INSTANCE.getUIProvider(project);
				if (provider != null) {
					provider.fillContextMenu(manager, project, new Object[]{selection});
				}
			}
		});
		Menu menu = manager.createContextMenu(control);
		control.setMenu(menu);
		menus.add(new MenuRegisterBean(manager, tv, "de.neufeld.navigator."+parentObject.eClass().getName().toLowerCase()));
	}

	public void setFocus() {
		// TODO Auto-generated method stub

	}
	 
}

