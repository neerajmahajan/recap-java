package lambda.learning;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class LambdaTest {

	@Test
	public void testSumUsingLambdaExpression() {

		BinaryOperation sum = (int a, int b) -> a + b;

		assertEquals("Sum should be 11 ", 11, sum.calculate(5, 6));
	}

	@Test
	public void testSumUsingStaticMethodReference() {

		BinaryOperation sum = StaticUtils::sum;
		assertEquals("Sum should be 11 ", 11, sum.calculate(5, 6));
	}

	@Test
	public void testSumUsingObjectMethodReference() {

		BinaryOperation sum = new Utils()::sum;
		assertEquals("Sum should be 11 ", 11, sum.calculate(5, 6));
	}

	@Test
	public void testObjectSortingArbitaryObjectMethodReference() {

		Employee[] employees = { 
				new Employee("Rohit",35,12.5f),
				new Employee("Neeraj", 35, 12.5f),
				new Employee("Vishal", 29, 15.2f)
				};
		Arrays.sort(employees,Employee::compareTo);
		
		assertEquals("Neeraj should be at first Index","Neeraj", employees[0].getName());
	}
}