package org.wecancodeit.spring.kitchen;

public class ApplianceDouble extends Appliance {

	public boolean poweredOn;

	@Override
	public void powerOn() {
		poweredOn = true;
	}
	
}
