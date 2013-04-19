/**
 */
package org.eclipsesource.accounting.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipsesource.accounting.util.AccountingAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingItemProviderAdapterFactory extends AccountingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Client} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientItemProvider clientItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClientAdapter() {
		if (clientItemProvider == null) {
			clientItemProvider = new ClientItemProvider(this);
		}

		return clientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Order} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemProvider orderItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderAdapter() {
		if (orderItemProvider == null) {
			orderItemProvider = new OrderItemProvider(this);
		}

		return orderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Deliverable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableItemProvider deliverableItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Deliverable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeliverableAdapter() {
		if (deliverableItemProvider == null) {
			deliverableItemProvider = new DeliverableItemProvider(this);
		}

		return deliverableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Invoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemProvider invoiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Invoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInvoiceAdapter() {
		if (invoiceItemProvider == null) {
			invoiceItemProvider = new InvoiceItemProvider(this);
		}

		return invoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Employee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeItemProvider employeeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeAdapter() {
		if (employeeItemProvider == null) {
			employeeItemProvider = new EmployeeItemProvider(this);
		}

		return employeeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.WorkPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPackageItemProvider workPackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.WorkPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkPackageAdapter() {
		if (workPackageItemProvider == null) {
			workPackageItemProvider = new WorkPackageItemProvider(this);
		}

		return workPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Clients} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientsItemProvider clientsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Clients}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClientsAdapter() {
		if (clientsItemProvider == null) {
			clientsItemProvider = new ClientsItemProvider(this);
		}

		return clientsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipsesource.accounting.Employees} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeesItemProvider employeesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipsesource.accounting.Employees}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeesAdapter() {
		if (employeesItemProvider == null) {
			employeesItemProvider = new EmployeesItemProvider(this);
		}

		return employeesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (clientItemProvider != null) clientItemProvider.dispose();
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (orderItemProvider != null) orderItemProvider.dispose();
		if (deliverableItemProvider != null) deliverableItemProvider.dispose();
		if (invoiceItemProvider != null) invoiceItemProvider.dispose();
		if (employeeItemProvider != null) employeeItemProvider.dispose();
		if (workPackageItemProvider != null) workPackageItemProvider.dispose();
		if (clientsItemProvider != null) clientsItemProvider.dispose();
		if (employeesItemProvider != null) employeesItemProvider.dispose();
	}

}
