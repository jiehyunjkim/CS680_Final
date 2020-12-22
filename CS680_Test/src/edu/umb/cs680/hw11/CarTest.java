package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw11.Car.PriceComparator;

class CarTest {

	@Test
	void testPriceCompare() {
		Car car1 = new Car(20000, 2017, 30000);
		Car car2 = new Car(10000, 2019, 50000);
		int result = PriceComparator.compare(car1, car2);
		assertTrue(result);
	}
	
	@Test
	void testYearCompare() {
		Car car1 = new Car(20000, 2017, 30000);
		Car car2 = new Car(10000, 2019, 50000);
		int result = YearComparator.compare(car1, car2);
		assertTrue(result);
	}
	
	@Test
	void testMileageCompare() {
		Car car1 = new Car(20000, 2017, 30000);
		Car car2 = new Car(10000, 2019, 50000);
		int result = MileageComparator.compare(car1, car2);
		assertTrue(result);
	}
	
	@Test
	void testParetoCompare() {
		Car car1 = new Car(20000, 2017, 30000);
		Car car2 = new Car(10000, 2019, 50000);
		int result = ParetoComparator.compare(car1, car2);
		assertTrue(result);
	}

}
