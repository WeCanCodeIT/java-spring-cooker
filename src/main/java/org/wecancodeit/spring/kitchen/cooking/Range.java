package org.wecancodeit.spring.kitchen.cooking;

import org.wecancodeit.spring.kitchen.Cooker;
import org.wecancodeit.spring.kitchen.ElectricalAppliance;

public class Range extends ElectricalAppliance implements Cooker {

	@Override
	public void cook() {
		System.out.println("Cooking on a hot surface!");
	}

}
