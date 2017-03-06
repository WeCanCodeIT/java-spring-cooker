package org.wecancodeit.spring.kitchen;

public abstract class ElectricalAppliance {

	public void powerOn() {
		System.out.println("Turning on the power for " + getClass().getSimpleName());
	}

}
