/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.tests.concurrency;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * The suite of tests related to concurrency and deadlock.
 * 
 * @since 3.1
 */
public final class ConcurrencyTestSuite extends TestSuite {

    /**
     * Returns the suite. This is required to use the JUnit Launcher.
     */
    public static final Test suite() {
        return new ConcurrencyTestSuite();
    }

    /**
     * Constructs a new instance of <code>ConcurrencyTestSuite</code> with all of
     * the relevent test cases.
     */
    public ConcurrencyTestSuite() {
        addTestSuite(NestedSyncExecDeadlockTest.class);
        addTestSuite(TransferRuleTest.class);
    }
}