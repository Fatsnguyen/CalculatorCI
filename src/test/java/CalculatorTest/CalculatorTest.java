package CalculatorTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.demo.Calculator;

public class CalculatorTest {
	  private Calculator calculator;

	    @BeforeMethod
	    public void setUp() {
	        calculator = new Calculator();
	    }

	    @Test
	    public void testAdd() {
	        Assert.assertEquals(calculator.add(2, 3), 5);
	        Assert.assertEquals(calculator.add(-1, 1), 0);
	        Assert.assertEquals(calculator.add(-3, -7), -10);
	    }

	    @Test
	    public void testSubtract() {
	        Assert.assertEquals(calculator.subtract(5, 3), 2);
	        Assert.assertEquals(calculator.subtract(2, 5), -3);
	        Assert.assertEquals(calculator.subtract(-5, -2), -3);
	    }

	    @Test
	    public void testMultiply() {
	        Assert.assertEquals(calculator.multiply(4, 5), 20);
	        Assert.assertEquals(calculator.multiply(-4, 5), -20);
	        Assert.assertEquals(calculator.multiply(0, 100), 0);
	    }

	    @Test
	    public void testDivide() {
	        Assert.assertEquals(calculator.divide(10, 2), 5);
	        Assert.assertEquals(calculator.divide(-9, 3), -3);
	        Assert.assertEquals(calculator.divide(0, 1), 0);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        calculator.divide(10, 0);
	    }
}
