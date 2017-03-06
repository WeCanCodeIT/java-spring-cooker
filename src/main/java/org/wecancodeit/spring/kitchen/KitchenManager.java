package org.wecancodeit.spring.kitchen;

import java.util.Collection;

public class KitchenManager {

	private Collection<Cooker> cookers;

	/**
	 * Constructor injection.
	 */
	public KitchenManager(Collection<Cooker> cookers) {
		this.cookers = cookers;
	}

	public void cookAllTheThings() {
		System.out.println("I'm doing the cooking!");
		
		for(Cooker currentCooker: cookers) {
			currentCooker.cook();
		}
	}

}
