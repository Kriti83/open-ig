/*
 * Copyright 2008-2012, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An ActionListener implementation with short method names when the ActionEvent is not necessary.
 * @author akarnokd, 2009.09.23.
 */
public abstract class Act implements ActionListener {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		act();
	}
	/** Perform the action. */
	public abstract void act();
}
