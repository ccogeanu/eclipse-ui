package org.eclipse.ui.tests.internal;

import junit.framework.*;

/**
 * Test all areas of the UI Implementation.
 */
public class InternalTestSuite extends TestSuite {

	/**
	 * Returns the suite.  This is required to
	 * use the JUnit Launcher.
	 */
	public static Test suite() {
		return new InternalTestSuite();
	}
	
	/**
	 * Construct the test suite.
	 */
	public InternalTestSuite() {
		addTest(new TestSuite(EditorActionBarsTest.class));
	}
}