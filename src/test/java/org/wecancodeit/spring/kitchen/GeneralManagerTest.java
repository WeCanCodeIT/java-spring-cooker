package org.wecancodeit.spring.kitchen;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

import java.util.Arrays;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneralManagerTest {

	@Test
	public void shouldPowerOnAppliance() {
		ApplianceDouble applianceDouble = new ApplianceDouble();
		GeneralManager underTest = new GeneralManager(Arrays.asList(applianceDouble));
		
		underTest.turnPowerOn();
		
		assertThat(applianceDouble.poweredOn, is(true));
	}
	
	boolean poweredOn;
	
	@Test
	public void shouldPowerOnApplianceWithAnonymousDouble() {
		Appliance applianceDouble = new Appliance() {
			@Override
			public void powerOn() {
				poweredOn = true;
			}
			
		};
		GeneralManager underTest = new GeneralManager(Arrays.asList(applianceDouble));
		
		underTest.turnPowerOn();
		
		assertThat(poweredOn, is(true));
	}
	
	@Mock
	private Appliance applianceDouble; // a mock actually
	
	@Test
	public void shouldPowerOnApplianceWithMockito() {
		MockitoAnnotations.initMocks(this);
		
		GeneralManager underTest = new GeneralManager(Arrays.asList(applianceDouble));
		
		underTest.turnPowerOn();

		verify(applianceDouble).powerOn();
	}
}
