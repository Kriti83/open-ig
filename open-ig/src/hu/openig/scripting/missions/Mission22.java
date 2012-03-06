/*
 * Copyright 2008-2012, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.scripting.missions;

import hu.openig.core.Pair;
import hu.openig.model.Fleet;
import hu.openig.model.InventoryItem;
import hu.openig.model.ObjectiveState;
import hu.openig.model.Planet;
import hu.openig.model.ResearchType;
import hu.openig.utils.XElement;

/**
 * Mission 22: enter level 4. Colonize or capture 7 more planets.
 * @author akarnokd, 2012.02.23.
 */
public class Mission22 extends Mission {
	/** Mission stages. */
	enum M22 {
		/** Not started. */
		NONE,
		/** Wait for objective. */
		WAIT,
		/** Running. */
		RUN,
		/** Done. */
		DONE
	}
	/** The current stage. */
	M22 stage = M22.NONE;
	/** The number of planets owned at the beginning of the mission. */
	long planetsOwned;
	@Override
	public boolean applicable() {
		return world.level == 4;
	}
	@Override
	public void onLevelChanged() {
		if (world.level < 4) {
			return;
		}
		removeMissions(1, 25);
		
		createMainShip();
		// achievement
		String a = "achievement.admiral";
		achievement(a);
	}
	
	/**
	 * Creates the main ship for level 4.
	 */
	void createMainShip() {
		Pair<Fleet, InventoryItem> own = findTaggedFleet("CampaignMainShip4", player);
		if (own != null) {
			return;
		}
		own = findTaggedFleet("CampaignMainShip3", player);
		if (own == null) {
			own = findTaggedFleet("CampaignMainShip2", player);
		}
		if (own == null) {
			own = findTaggedFleet("CampaignMainShip1", player);
		}
		Fleet f = null;
		if (own != null 
				&& own.first.getStatistics().battleshipCount < 3 
				&& own.first.getStatistics().cruiserCount < 25
				&& own.first.inventoryCount(research("Fighter2")) < 30 - 6) {
			f = own.first;
		} else {
			Planet ach = planet("Achilles");
			f = createFleet(label("Empire.main_fleet"), player, ach.x + 5, ach.y + 5);
		}			
		ResearchType rt = research("Flagship");
		f.addInventory(rt, 1);
		f.addInventory(research("LightTank"), 6);
		
		f.addInventory(research("Cruiser1"), 1);
		f.addInventory(research("Fighter2"), 6);
		
		InventoryItem ii = f.getInventoryItem(rt);
		ii.tag = "CampaignMainShip4";

		// loadout
		setSlot(ii, "laser", "Laser2", 24);
		setSlot(ii, "bomb", "Bomb1", 8);
		setSlot(ii, "rocket", "Rocket1", 16);
		setSlot(ii, "radar", "Radar1", 1);
		setSlot(ii, "cannon1", "IonCannon", 12);
		setSlot(ii, "cannon2", "IonCannon", 12);
		setSlot(ii, "shield", "Shield1", 14);
		setSlot(ii, "hyperdrive", "HyperDrive1", 1);
	}
	@Override
	public void onTime() {
		if (stage == M22.NONE) {
			stage = M22.WAIT;
			addTimeout("Mission-22-Objective", 4000);
			planetsOwned = player.statistics.planetsOwned;
		}
		if (checkTimeout("Mission-22-Objective")) {
			helper.showObjective("Mission-22");
			stage = M22.RUN;
		}
		if (stage == M22.RUN) {
			if (player.statistics.planetsOwned >= planetsOwned + 7) {
				helper.setObjectiveState("Mission-22", ObjectiveState.SUCCESS);
				stage = M22.DONE;
				addTimeout("Mission-22-Hide", 13000);
				addMission("Mission-24", 1);
			}
		}
		if (checkTimeout("Mission-22-Hide")) {
			helper.objective("Mission-22").visible = false;
		}
		String[] planets = { "Achilles", "Naxos", "San Sterling", "New Caroline", "Centronom", "Zeuson" };
		setPlanetMessages(planets);
		checkMainShip();
	}
	/** Check if the main ship is still operational. */
	void checkMainShip() {
		Pair<Fleet, InventoryItem> ft = findTaggedFleet("CampaignMainShip4", player);
		if (ft == null) {
			if (!helper.hasTimeout("MainShip-Lost")) {
				helper.setTimeout("MainShip-Lost", 3000);
			}
			if (helper.isTimeout("MainShip-Lost")) {
				helper.gameover();
				loseGameMovie("loose/destroyed_level_3");
			}
		}
	}

	@Override
	public void save(XElement xmission) {
		xmission.set("stage", stage);
		xmission.set("planets-owned", planetsOwned);
	}
	@Override
	public void load(XElement xmission) {
		stage = M22.valueOf(xmission.get("stage", M22.NONE.toString()));
		planetsOwned = xmission.getLong("planets-owned");
	}
	@Override
	public void reset() {
		stage = M22.NONE;
	}
}
