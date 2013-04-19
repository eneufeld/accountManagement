package org.eclipsesource.accounting.internal.ui.pshelf.e3;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.eclipsesource.accounting.ui.pshelf.MenuRegisterBean;
import org.eclipsesource.accounting.ui.pshelf.PShelfProjectNavigator;

public class ProjectPShelfViewPart extends ViewPart {

	public static final String VIEW_ID="org.eclipsesource.accounting.ui.pshelf.e3.pshelf";
	
	private PShelfProjectNavigator projectNavigator;

	public ProjectPShelfViewPart() {
		projectNavigator = new PShelfProjectNavigator();
	}

	@Override
	public void createPartControl(Composite parent) {
		ISelection selection=getSite().getWorkbenchWindow().getSelectionService().getSelection("org.eclipse.emf.ecp.ui.ModelExplorerView");
		ECPProject project=null;
		if(selection!=null){
			project=(ECPProject)((IStructuredSelection)selection).getFirstElement();
		}
		else{
			if(ECPProjectManager.INSTANCE.getProjects().isEmpty()){
				new Label(parent, SWT.NONE).setText("No project found!");
				return;
			}
			project=ECPProjectManager.INSTANCE.getProjects().iterator().next();
		}
		projectNavigator.createContent(parent,project);
		for(MenuRegisterBean bean:projectNavigator.getMenus())
			getSite().registerContextMenu(bean.getId(), bean.getManager(), bean.getSelectionProvider());
	}

	@Override
	public void setFocus() {
		projectNavigator.setFocus();
	}

}
