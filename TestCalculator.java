package practice_test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void testAdd() {
		assertTrue(11 == Calculator.add(5,6));
		assertTrue(25 == Calculator.add(20,5));
	}
	
	@Test
	void testSubtract() {
		assertTrue(16 == Calculator.divide(20,4));
		assertTrue(8 == Calculator.divide(10,2));
	}
	
	@Test
	void testMultiply() {
		assertTrue(30 == Calculator.multiply(5,6));
		assertTrue(16 == Calculator.multiply(4,4));
	}
	
	@Test
	void testDivide() {
		assertTrue(5 == Calculator.divide(20,4));
		assertTrue(5 == Calculator.divide(10,2));
	}
	


}
