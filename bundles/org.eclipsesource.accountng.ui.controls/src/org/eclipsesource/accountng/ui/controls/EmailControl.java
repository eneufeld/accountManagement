package org.eclipsesource.accountng.ui.controls;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.ecp.edit.internal.swt.controls.StringControl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class EmailControl extends StringControl {

	public EmailControl(boolean showLabel,
			IItemPropertyDescriptor itemPropertyDescriptor,
			EStructuralFeature feature, ECPControlContext modelElementContext,
			boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext,
				embedded);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void fillInnerComposite(Composite composite) {
		super.fillInnerComposite(composite);
		((GridLayout)composite.getLayout()).numColumns=2;
		Button button=new Button(composite, SWT.PUSH);
		button.setText("Send Mail");
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Desktop.getDesktop().mail(URI.create("mailto:"+getModelValue().getValue()));
				} catch (IOException e1) {
				}
			}
			
		});
	}

}
