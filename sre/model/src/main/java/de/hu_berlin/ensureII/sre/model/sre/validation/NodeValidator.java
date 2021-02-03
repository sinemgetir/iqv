/**
 *
 * $Id$
 */
package de.hu_berlin.ensureII.sre.model.sre.validation;


/**
 * A sample validator interface for {@link de.hu_berlin.ensureII.sre.model.sre.Node}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeValidator {
    boolean validate();

    boolean validateId(int value);
    boolean validateRate(int value);

    boolean validateSrcState(int value);

    boolean validateTgtState(int value);
}
