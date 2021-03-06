/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
@SuppressWarnings("all")
public class ServerGeneratorLanguageLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ServerGeneratorLanguageLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
