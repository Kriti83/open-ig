/*
 * Copyright 2008-2011, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.model;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * A fleet.
 * @author akarnokd, 2010.01.07.
 */
public class Fleet implements Named, Owned {
	/** The unique fleet identifier. */
	public int id;
	/** The owner of the fleet. */
	public Player owner;
	/** The X coordinate. */
	public int x;
	/** The Y coordinate. */
	public int y;
	/** The associated ship icon. */
	public BufferedImage shipIcon;
	/** The radar radius. */
	public int radar;
	/** The fleet name. */
	public String name;
	/** The fleet inventory: ships and tanks. */
	public final List<InventoryItem> inventory = new ArrayList<InventoryItem>();
	/** The current list of movement waypoints. */
	public final List<Point> waypoints = new ArrayList<Point>();
	/** If the fleet should follow the other fleet. */
	public Fleet targetFleet;
	/** If the fleet should move to the planet. */
	public Planet targetPlanet;
	/** The movement mode. */
	public enum FleetMode {
		/** Simply move there. */
		MOVE,
		/** Attack the target. */
		ATTACK
	}
	/** The fleet movement mode. */
	public FleetMode mode;
	@Override
	public String name() {
		return name;
	}
	@Override
	public Player owner() {
		// TODO Auto-generated method stub
		return owner;
	}
	/**
	 * Returns the number of items of the give research type.
	 * @param rt the research type to count
	 * @return the count
	 */
	public int inventoryCount(ResearchType rt) {
		int count = 0;
		for (InventoryItem pii : inventory) {
			if (pii.type == rt) {
				count += pii.count;
			}
		}
		return count;
	}
	/** 
	 * Change the inventory amount of a given technology. 
	 * @param type the item type
	 * @param owner the owner
	 * @param amount the amount delta
	 */
	public void changeInventory(ResearchType type, Player owner, int amount) {
		int idx = 0;
		boolean found = false;
		for (InventoryItem pii : inventory) {
			if (pii.type == type && pii.owner == owner) {
				pii.count += amount;
				if (pii.count <= 0) {
					inventory.remove(idx);
				}
				found = true;
				break;
			}
			idx++;
		}
		if (!found && amount > 0) {
			InventoryItem pii = new InventoryItem();
			pii.type = type;
			pii.owner = owner;
			pii.count = amount;
			pii.hp = type.productionCost;
			int shieldMax = pii.shieldMax();
			if (shieldMax >= 0) {
				pii.shield = shieldMax;
			}
			inventory.add(pii);
		}
	}
	/**
	 * Returns the number of items of the give category of the given owner.
	 * @param cat the research sub-category
	 * @return the count
	 */
	public int inventoryCount(ResearchSubCategory cat) {
		int count = 0;
		for (InventoryItem pii : inventory) {
			if (pii.type.category == cat) {
				count += pii.count;
			}
		}
		return count;
	}
	/** @return calculate the fleet statistics. */
	public FleetStatistics getStatistics() {
		FleetStatistics result = new FleetStatistics();

		result.speed = Integer.MAX_VALUE;
		radar = 0;
		for (InventoryItem fii : inventory) {
			if (fii.type.category == ResearchSubCategory.SPACESHIPS_BATTLESHIPS) {
				result.battleshipCount += fii.count;
			} else
			if (fii.type.category == ResearchSubCategory.SPACESHIPS_CRUISERS) {
				result.cruiserCount += fii.count;
			} else
			if (fii.type.category == ResearchSubCategory.SPACESHIPS_FIGHTERS) {
				result.fighterCount += fii.count;
			} else
			if (fii.type.category == ResearchSubCategory.WEAPONS_TANKS
					|| fii.type.category == ResearchSubCategory.WEAPONS_VEHICLES
			) {
				result.vehicleCount += fii.count;
			}
			
			if (fii.type.has("radar")) {
				radar = Math.max(radar, fii.type.getInt("radar")); 
			}
			if (fii.type.has("vehicles")) {
				result.vehicleMax += fii.type.getInt("vehicles"); 
			}
			if (fii.type.has("damage")) {
				result.firepower += fii.type.getInt("damage");
			}
			
			for (InventorySlot slot : fii.slots) {
				if (slot.type != null) {
					if (slot.type.has("radar")) {
						radar = Math.max(radar, slot.type.getInt("radar")); 
					}
					if (slot.type.has("vehicles")) {
						result.vehicleMax += slot.type.getInt("vehicles"); 
					}
					if (slot.type.has("damage")) {
						result.firepower += slot.type.getInt("damage");
					}
					if (slot.type.has("speed")) {
						result.speed = Math.min(result.speed, slot.type.getInt("speed"));
					}
				}
			}
		}
		
		if (result.speed == Integer.MAX_VALUE) {
			result.speed = 6;
		}
		
		return result;
	}
	/** 
	 * Add a given number of inventory item to this fleet.
	 * @param type the technology to add
	 * @param amount the amount to add
	 */
	public void addInventory(ResearchType type, int amount) {
		if (type.category == ResearchSubCategory.SPACESHIPS_FIGHTERS
			|| type.category == ResearchSubCategory.WEAPONS_TANKS
			|| type.category == ResearchSubCategory.WEAPONS_VEHICLES
		) {
			changeInventory(type, owner, amount);
		} else {
			for (int i = 0; i < amount; i++) {
				InventoryItem ii = new InventoryItem();
				ii.count = 1;
				ii.type = type;
				ii.owner = owner;
				ii.hp = type.productionCost;
				
				for (EquipmentSlot es : type.slots.values()) {
					InventorySlot is = new InventorySlot();
					is.slot = es;
					
					List<ResearchType> availList = owner.availableLevel(type);
					
					for (ResearchType rt1 : es.items) {
						if (availList.contains(rt1)) {
							is.type = rt1;
							// always assign a hyperdrive
							if (rt1.category == ResearchSubCategory.EQUIPMENT_HYPERDRIVES) {
								is.count = 1;
							} else {
								is.count = es.max / 2;
							}
						}
					}
					
					ii.slots.add(is);
				}
				
				inventory.add(ii);
			}
		}
	}
}
