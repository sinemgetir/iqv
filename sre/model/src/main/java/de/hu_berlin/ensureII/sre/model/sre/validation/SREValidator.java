/**
 *
 * $Id$
 */
package de.hu_berlin.ensureII.sre.model.sre.validation;

import de.hu_berlin.ensureII.sre.model.sre.Node;

/**
 * A sample validator interface for {@link de.hu_berlin.ensureII.sre.model.sre.SRE}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SREValidator {
    boolean validate();

    boolean validateRoot(Node value);
}
