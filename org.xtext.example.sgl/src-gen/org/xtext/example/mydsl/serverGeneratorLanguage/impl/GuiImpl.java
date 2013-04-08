/**
 */
package org.xtext.example.mydsl.serverGeneratorLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.serverGeneratorLanguage.Gui;
import org.xtext.example.mydsl.serverGeneratorLanguage.GuiFeature;
import org.xtext.example.mydsl.serverGeneratorLanguage.Server;
import org.xtext.example.mydsl.serverGeneratorLanguage.ServerGeneratorLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.serverGeneratorLanguage.impl.GuiImpl#getGuiFeatures <em>Gui Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiImpl extends TypeImpl implements Gui
{
  /**
   * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected Server server;

  /**
   * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected static final int LAYOUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected int layout = LAYOUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getGuiFeatures() <em>Gui Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiFeatures()
   * @generated
   * @ordered
   */
  protected EList<GuiFeature> guiFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuiImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServerGeneratorLanguagePackage.Literals.GUI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Server getServer()
  {
    if (server != null && server.eIsProxy())
    {
      InternalEObject oldServer = (InternalEObject)server;
      server = (Server)eResolveProxy(oldServer);
      if (server != oldServer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerGeneratorLanguagePackage.GUI__SERVER, oldServer, server));
      }
    }
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Server basicGetServer()
  {
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServer(Server newServer)
  {
    Server oldServer = server;
    server = newServer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServerGeneratorLanguagePackage.GUI__SERVER, oldServer, server));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(int newLayout)
  {
    int oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServerGeneratorLanguagePackage.GUI__LAYOUT, oldLayout, layout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GuiFeature> getGuiFeatures()
  {
    if (guiFeatures == null)
    {
      guiFeatures = new EObjectContainmentEList<GuiFeature>(GuiFeature.class, this, ServerGeneratorLanguagePackage.GUI__GUI_FEATURES);
    }
    return guiFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI__GUI_FEATURES:
        return ((InternalEList<?>)getGuiFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI__SERVER:
        if (resolve) return getServer();
        return basicGetServer();
      case ServerGeneratorLanguagePackage.GUI__LAYOUT:
        return getLayout();
      case ServerGeneratorLanguagePackage.GUI__GUI_FEATURES:
        return getGuiFeatures();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI__SERVER:
        setServer((Server)newValue);
        return;
      case ServerGeneratorLanguagePackage.GUI__LAYOUT:
        setLayout((Integer)newValue);
        return;
      case ServerGeneratorLanguagePackage.GUI__GUI_FEATURES:
        getGuiFeatures().clear();
        getGuiFeatures().addAll((Collection<? extends GuiFeature>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI__SERVER:
        setServer((Server)null);
        return;
      case ServerGeneratorLanguagePackage.GUI__LAYOUT:
        setLayout(LAYOUT_EDEFAULT);
        return;
      case ServerGeneratorLanguagePackage.GUI__GUI_FEATURES:
        getGuiFeatures().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ServerGeneratorLanguagePackage.GUI__SERVER:
        return server != null;
      case ServerGeneratorLanguagePackage.GUI__LAYOUT:
        return layout != LAYOUT_EDEFAULT;
      case ServerGeneratorLanguagePackage.GUI__GUI_FEATURES:
        return guiFeatures != null && !guiFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (layout: ");
    result.append(layout);
    result.append(')');
    return result.toString();
  }

} //GuiImpl
