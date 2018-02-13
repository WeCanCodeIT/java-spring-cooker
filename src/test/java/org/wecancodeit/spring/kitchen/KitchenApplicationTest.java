package org.wecancodeit.spring.kitchen;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class KitchenApplicationTest {

	@InjectMocks
	private KitchenApplication underTest;

	@Mock
	private GeneralManager gm;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldTellGmToTurnPowerOn() {
		
		underTest.doThingsInTheKitchen();
		
		verify(gm).turnPowerOn();
	}
}
