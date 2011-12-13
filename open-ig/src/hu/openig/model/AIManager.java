/*
 * Copyright 2008-2012, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.model;

import hu.openig.utils.XElement;

import java.util.List;

/**
 * Base interface to manage AI related operations.
 * @author akarnokd, 2011.12.08.
 */
public interface AIManager {
	/**
	 * Prepare the world.
	 * @param w the real world
	 * @param p the player
	 */
	void prepare(World w, Player p);
	/**
	 * Manage the world.
	 */
	void manage();
	/**
	 * Apply the changes from the world management.
	 */
	void apply();
	/**
	 * Calculates the diplomatic response to an offer coming from another player.
	 * @param world the world
	 * @param we the target player
	 * @param other the other player
	 * @param offer the kind of offer/request
	 * @return the response
	 */
	ResponseMode diplomacy(World world, Player we, Player other, DiplomaticInteraction offer);
	/**
	 * Handle some aspects of a space battle.
	 * TODO output?
	 * @param world the world
	 * @param player the AI's player object
	 * @param idles the list of objects which have completed their current attack objectives and awaiting new commands
	 * @return the global action
	 */
	SpacewarAction spaceBattle(SpacewarWorld world, Player player, List<SpacewarStructure> idles);
	/**
	 * Handle some aspects of a ground battle.
	 * TODO output?
	 * @param world the world
	 * @param we the target player
	 * @param battle the battle information
	 */
	void groundBattle(World world, Player we, BattleInfo battle);
	/**
	 * Save the state of this AI manager from a save file.
	 * @param out the output XElement
	 * @param world the global world
	 * @param player the AI's player object
	 */
	void save(XElement out, World world, Player player);
	/**
	 * Load the state of this AI manager from a save file.
	 * @param in the input XElement
	 * @param world the global world
	 * @param player the AI's player object
	 */
	void load(XElement in, World world, Player player);
}
