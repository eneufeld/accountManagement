package org.eclipsesource.accounting.ui.pshelf;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;

public class MenuRegisterBean {

	private final MenuManager manager;
	private final ISelectionProvider selectionProvider;
	private final String id;

	public MenuRegisterBean(MenuManager manager,
			ISelectionProvider selectionProvider, String id) {
		super();
		this.manager = manager;
		this.selectionProvider = selectionProvider;
		this.id = id;
	}

	public MenuManager getManager() {
		return manager;
	}

	public ISelectionProvider getSelectionProvider() {
		return selectionProvider;
	}

	public String getId() {
		return id;
	}
	
}
