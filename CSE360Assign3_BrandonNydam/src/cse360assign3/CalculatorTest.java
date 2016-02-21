/**CalculatorTest.java includes test cases to thoroughly test all of the methods in Calculator.java

*@version February 20, 2016
*@author Brandon Nydam
*PIN: 618

*/


package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest 
{
	
	// Tests if the constructor for Calculator is working properly
	@Test
	public void testCalculator() 
	{
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}
	
	
	// Tests if the getter for total is working properly
	@Test
	public void testGetTotal()
	{
		Calculator testCalc = new Calculator();
	
		assertEquals(testCalc.getTotal(), 0); // checking if it starts at zero
		
		testCalc.add(4);
		
		assertEquals(testCalc.getTotal(), 4); // total is being modified and returned
	}
	
	
	// Tests if the add method is working properly- only positive integers
	@Test
	public void testAddPos() 
	{
		
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.add(10); // test one operation
		assertEquals(testCalc.getTotal(), 10);
		
		testCalc.add(4); // test multiple operations
		assertEquals(testCalc.getTotal(), 14);
		
		testCalc.add(6);
		assertEquals(testCalc.getTotal(), 20);
		
		testCalc.add(-5); // test negative addition(subtraction using the addition method)
		assertEquals(testCalc.getTotal(), 15);
	}
	
	
	//Tests if the add method works for negative integers
	@Test
	public void testAddNeg() 
	{
		
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.add(-10); // test one operation
		assertEquals(testCalc.getTotal(), -10);
		
	}
	
	
	//Tests if the subtract method is working for positive integers
	@Test
	public void testSubtractPos()
	{
		
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.subtract(10); // test one operation, should be negative
		assertEquals(testCalc.getTotal(), -10);
		
		testCalc.subtract(4); // test multiple operations
		assertEquals(testCalc.getTotal(), -14);
		
		testCalc.subtract(6); // 
		assertEquals(testCalc.getTotal(), -20);
		


	}
	
	
	//Test if subtract works for negative integers
	@Test
	public void testSubtractNeg()
	{
		
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.subtract(10); // test one operation, should be negative
		assertEquals(testCalc.getTotal(), -10);
		
		testCalc.subtract(-15); // test double negation(adding using the subtract method)
		assertEquals(testCalc.getTotal(), 5);

	}
	
	
	// Test multiply method when total is zero
	@Test
	public void testMultiplyTotZero() 
	{
		
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.multiply(4); // test multiplication if total is zero
		assertEquals(testCalc.getTotal(), 0);
		
		testCalc.multiply(0); // test multiplication if total is zero
		assertEquals(testCalc.getTotal(), 0);
	}
	
	
	// Test multiply method when total is nonzero
	@Test
	public void testMultiplyTotNonZero() 
	{
		
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.add(1);
		assertEquals(testCalc.getTotal(), 1);
		
		testCalc.multiply(4); // test multiplication if total is 1
		assertEquals(testCalc.getTotal(), 4);
		
		testCalc.multiply(5); // test multiplication if total is 4
		assertEquals(testCalc.getTotal(), 20);
		
		testCalc.multiply(0); // test multiplication if value is 0
		assertEquals(testCalc.getTotal(), 0);
		
	}
	
	
	//Test divide method when dividing by a nonzer integer
	@Test
	public void testDivideNonzero()
	{
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.add(10);
		assertEquals(testCalc.getTotal(), 10);
		
		testCalc.divide(2); // test divide 10/2 = 5
		assertEquals(testCalc.getTotal(), 5);
		
		testCalc.divide(5); // test divide integer by itself 5/5 = 1
		assertEquals(testCalc.getTotal(), 1);

	}
	
	
	//Test divide method when dividing by zero
	@Test
	public void testDivideZero()
	{
		Calculator testCalc = new Calculator();
		
		assertEquals(testCalc.getTotal(), 0); // checking if total starts at zero
		
		testCalc.add(10);
		assertEquals(testCalc.getTotal(), 10);
		
		testCalc.divide(0); // test divide 10/0 = 0 -- by this calculator
		assertEquals(testCalc.getTotal(), 0);

	}
	
	
	//Not Currently implemented
	@Test
	public void testGetHistory() 
	{
		fail("Not yet implemented");
	}

}
