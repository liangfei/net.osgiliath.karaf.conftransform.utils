/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import java.util.Collection;

import java.util.List;
import org.apache.maven.pom._4._0.Plugin;
import org.apache.maven.pom._4._0.PluginsType3;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugins Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.PluginsType3Impl#getPlugin <em>Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluginsType3Impl extends EObjectImpl implements PluginsType3 {
	/**
	 * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugin()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugin> plugin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginsType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.PLUGINS_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugin> getPlugin() {
		if (plugin == null) {
			plugin = new EObjectContainmentEList<Plugin>(Plugin.class, this, _0Package.PLUGINS_TYPE3__PLUGIN);
		}
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PLUGINS_TYPE3__PLUGIN:
				return ((InternalEList<?>)getPlugin()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.PLUGINS_TYPE3__PLUGIN:
				return getPlugin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.PLUGINS_TYPE3__PLUGIN:
				getPlugin().clear();
				getPlugin().addAll((Collection<? extends Plugin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.PLUGINS_TYPE3__PLUGIN:
				getPlugin().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.PLUGINS_TYPE3__PLUGIN:
				return plugin != null && !plugin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PluginsType3Impl
