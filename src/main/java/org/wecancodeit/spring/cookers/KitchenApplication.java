package org.wecancodeit.spring.cookers;

import org.wecancodeit.spring.cookers.cleaning.Dishwasher;
import org.wecancodeit.spring.cookers.cooking.Microwave;
import org.wecancodeit.spring.cookers.cooking.PizzaOven;
import org.wecancodeit.spring.cookers.cooking.Range;

/**
 * Note that we're using packages now.
 */
public class KitchenApplication {

	public static void main(String[] args) {

		Dishwasher dishwasher = new Dishwasher();
		Microwave microwave = new Microwave();
		PizzaOven pizzaOven = new PizzaOven();
		Range range = new Range();
		
		KitchenApplication application = new KitchenApplication();
		application.doThingsInTheKitchen();
	}

	private GeneralManager generalMgr;

	private KitchenManager kitchenMgr;

	/**
	 * This makes the class responsible for populating its attributes.
	 */
	public KitchenApplication() {
		this.generalMgr = new GeneralManager();
		this.kitchenMgr = new KitchenManager();
	}

	/**
	 * This is dependency injection (constructor injection). It inverts control.
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
