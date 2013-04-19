package org.eclipsesource.accounting.internal.ui.pshelf.e3;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class ECPProjectPShelfHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().showView(ProjectPShelfViewPart.VIEW_ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
