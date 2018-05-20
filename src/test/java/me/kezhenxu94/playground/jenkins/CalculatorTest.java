package me.kezhenxu94.playground.jenkins;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kezhenxu94 on 11/14/17.
 *
 * @author kezhenxu94 (kezhenxu94 at 163 dot com)
 */
public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void plus() {
		assert calculator.plus(1, 1) == 2;
		assert calculator.plus(Integer.MAX_VALUE, Integer.MAX_VALUE) == 2L * Integer.MAX_VALUE;
	}
}