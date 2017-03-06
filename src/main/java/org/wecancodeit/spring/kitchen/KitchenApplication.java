package org.wecancodeit.spring.kitchen;

import java.util.Arrays;
import java.util.Collection;

import org.wecancodeit.spring.kitchen.cleaning.Dishwasher;
import org.wecancodeit.spring.kitchen.cooking.Microwave;
import org.wecancodeit.spring.kitchen.cooking.PizzaOven;
import org.wecancodeit.spring.kitchen.cooking.Range;

public class KitchenApplication {

	public static void main(String[] args) {

		Dishwasher dishwasher = new Dishwasher();
		Microwave microwave = new Microwave();
		PizzaOven pizzaOven = new PizzaOven();
		Range range = new Range();
		
		Collection<ElectricalAppliance> appliances = Arrays.asList(dishwasher, microwave, range);
		GeneralManager gm = new GeneralManager(appliances);

		Collection<Cooker> cookers = Arrays.asList(microwave, range, pizzaOven);
		KitchenManager km = new KitchenManager(cookers);
		
		KitchenApplication application = new KitchenApplication(gm, km);
		application.doThingsInTheKitchen();
	}

	private GeneralManager generalMgr;

	private KitchenManager kitchenMgr;

	/**
	 * This is dependency injection (constructor injection).
	 */
	public KitchenApplication(GeneralManager generalMgr, KitchenManager kitchenMgr) {
		this.generalMgr = generalMgr;
		this.kitchenMgr = kitchenMgr;
	}

	/**
	 * This isn't static. It's an instance method.
	 */
	public void doThingsInTheKitchen() {

		System.out.println("Telling the GM to turn the power on.");
		generalMgr.turnPowerOn();

		System.out.println();
		System.out.println("Telling the kitchen manager to get cooking.");
		kitchenMgr.cookAllTheThings();
	}
}
