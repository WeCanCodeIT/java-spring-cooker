package org.wecancodeit.spring.cookers;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.wecancodeit.spring.cookers.cleaning.Dishwasher;
import org.wecancodeit.spring.cookers.cooking.Microwave;

public class GeneralManager {

	private Collection<Appliance> appliances;

	/**
	 * Here the class controls how appliances is populated.
	 */
	public GeneralManager() {
		appliances = new ArrayList<Appliance>();
		appliances.add(new Dishwasher());
		appliances.add(new Microwave());
	}
	
	/**
	 * Constructor injection again.
	 */
	public GeneralManager(Collection<Appliance> appliances) {
		this.appliances = appliances;
	}

	public void turnPowerOn() {
		System.out.println("I'm turning the power on so we can get cooking!");

		for (Appliance currentAppliance : appliances) {
			currentAppliance.powerOn();
		}
	}

}
