package org.wecancodeit.spring.cookers.cooking;

import org.springframework.stereotype.Component;
import org.wecancodeit.spring.cookers.Cooker;

@Component
public class PizzaOven implements Cooker {

	@Override
	public void cook() {
		System.out.println("Baking pizzas over burning wood!");
	}
	
}
