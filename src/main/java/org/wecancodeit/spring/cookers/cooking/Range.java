package org.wecancodeit.spring.cookers.cooking;

import org.springframework.stereotype.Component;
import org.wecancodeit.spring.cookers.Appliance;
import org.wecancodeit.spring.cookers.Cooker;

@Component
public class Range extends Appliance implements Cooker {

	@Override
	public void cook() {
		System.out.println("Cooking on a hot surface!");
	}

}
