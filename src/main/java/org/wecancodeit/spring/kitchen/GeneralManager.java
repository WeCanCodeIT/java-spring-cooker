package org.wecancodeit.spring.kitchen;

import java.util.Collection;

public class GeneralManager {

	private Collection<ElectricalAppliance> appliances;
	
	/**
	 * Constructor injection again.
	 */
	public GeneralManager(Collection<ElectricalAppliance> appliances) {
		this.appliances = appliances;
	}

	public void turnPowerOn() {
		System.out.println("I'm turning the power on so we can get cooking!");

		for (ElectricalAppliance currentAppliance : appliances) {
			currentAppliance.powerOn();
		}
	}

}
