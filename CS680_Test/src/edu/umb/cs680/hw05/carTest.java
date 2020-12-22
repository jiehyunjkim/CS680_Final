package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class carTest {
	private String[] carToStringArray(car c) {
		String[] carInfo = {c.getMake(), c.getModel(), Integer.toString(c.getMileage()), 
				Integer.toString(c.getYear()),Float.toString(c.getPrice())};
		return carInfo;
	}
	
	private String[] car1ToStringArray(car c) {
		String[] carInfo = {c.getMake(), c.getModel(), Integer.toString(c.getYear())};
		return carInfo;
	}
	@Test
	void verifyCarEqualityWithEverything() {
		String[] expected = {"Honda", "Altima", "45000", "2015", "12000.0"};
		car actual = new car("Honda", "Altima", 45000, 2015, 12000);
		assertArrayEquals(expected, carToStringArray(actual));
	}
	@Test 
	void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Toyota", "RAV4", "2018"};
		car actual = new car("Toyota", "RAV4", 0, 2018, 50000);
		assertArrayEquals(expected, car1ToStringArray(actual));
	}

}
