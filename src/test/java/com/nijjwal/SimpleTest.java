package com.nijjwal;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

public class SimpleTest {

	private static Simple simple;

	@BeforeClass
	public static void initSimple() {
		simple = new Simple();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This method is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This method is executed after each Test");
	}

	@Test
	public void displayHiddenNumber() {
		int x = simple.printNumber();
		assertEquals(8, x);
	}

	@Test
	public void addTwoNumbersTest() {
		int x = simple.addTwoNumbers(2, 3);
		assertEquals(5, x);
	}

	@Test
	public void subtractTwoNumbersTest() {
		int x = simple.subtractTwoNumbers(10, 7);
		assertEquals(3, x);
	}

}
