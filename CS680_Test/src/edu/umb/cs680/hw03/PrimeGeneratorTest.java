package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {
	
	@Test
	public void testPositiveNumbers() {
		PrimeGenerator gen = new PrimeGenerator(1, 10);
		gen.generatePrimes();
		Long[] expectedPrimes = {2L, 3L, 5L, 7L};
		assertArrayEquals(expectedPrimes, gen.getPrimes().toArray());
	}
	@Test
	public void testNegativeNumberswithTryCatch() {
		try{
			PrimeGenerator gen = new PrimeGenerator(-10, -1);
			gen.generatePrimes();
			fail("Wrong input values: from=" + -10 + " to=" + -1);
		}
		catch(RuntimeException ex){
			assertEquals("Wrong input values: from=" + -10 + " to=" + -1, ex.getMessage());
		}
	}
	@Test
	public void wrongRangewithTryCatch() {
		try{
			PrimeGenerator gen = new PrimeGenerator(100, 10);
			gen.generatePrimes();
			fail("Wrong input values: from=" + 100 + " to=" + 10);
		}
		catch(RuntimeException ex){
			assertEquals("Wrong input values: from=" + 100 + " to=" + 10, ex.getMessage());
		}
	}

}
