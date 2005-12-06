/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.views.markers.internal;

/**
 * The MarkerNode class is the class that handles category nodes and 
 * concrete markers.
 *
 */
public abstract class MarkerNode {

	/**
	 * Get the children of the node.
	 * @return MarkerNode[]
	 */
	public abstract MarkerNode[] getChildren();

	/**
	 * Return the parent node or <code>null</code> if this is a top
	 * level element.
	 * @return MarkerNode
	 */
	public abstract MarkerNode getParent() ;

	/**
	 * Return whether or not this is a concrete node
	 * @return boolean
	 */
	public abstract boolean isConcrete();
	
	/**
	 * Return whether or not this is a stale node
	 * @return boolean
	 */
	public abstract boolean isStale();

	/**
	 * Return the description of the receiver.
	 * @return String
	 */
	public abstract String getDescription() ;

	/**
	 * Remove the child from the receiver.
	 * @param marker
	 */
	public abstract void removeChild(MarkerNode marker);

}
