package org.eclipsesource.accounting.internal.ui.e3;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.eclipsesource.account.ui.ProjectTurnoverView;
import org.eclipsesource.accounting.Project;

public class ProjectTurnoverViewPart extends ViewPart {

	public static final String VIEW_ID="org.eclipsesource.accounting.ui.e3.projectturnover";
	
	private ProjectTurnoverView projectTurnoverView;
	
	public ProjectTurnoverViewPart() {
		projectTurnoverView=new ProjectTurnoverView();
	}

	@Override
	public void createPartControl(Composite parent) {
		ISelection selection=getSite().getWorkbenchWindow().getSelectionService().getSelection("org.eclipse.emf.ecp.ui.ModelExplorerView");
		if(selection==null){
			new Label(parent, SWT.NONE).setText("Nothing selected!");
			return;
		}
		
		Project project=(Project)((IStructuredSelection)selection).getFirstElement();
		projectTurnoverView.createContent(parent, project);

	}

	@Override
	public void setFocus() {
		projectTurnoverView.focus();
	}

	@Override
	public void dispose() {
		projectTurnoverView.dispose();
		super.dispose();
	}

}
