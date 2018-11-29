package lambda.learning;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

import org.junit.Test;

public class LambdaTest {

	@Test
	public void testSumUsingLambdaExpression() {

		BinaryOperation sum = (int a, int b) -> a + b;

		assertEquals("Sum should be 11 ", 11, sum.calculate(5, 6));
	}
	
	@Test
	public void testObjectSortingUsingLambdaExpression() {

		Employee[] employees = {
				new Employee("Rohit", 35, 12.5f),
				new Employee("Neeraj", 35, 12.5f),
				new Employee("Vishal", 29, 15.2f)
				};
		
		Arrays.sort(employees, (x, y) -> {
			return x.getName().compareTo(y.getName());
		});

		assertEquals("Neeraj should be at first Index", "Neeraj", employees[0].getName());
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
	public void testObjectSortingUsingArbitaryObjectMethodReference() {

		Employee[] employees = {
				new Employee("Rohit", 35, 12.5f),
				new Employee("Neeraj", 35, 12.5f),
				new Employee("Vishal", 29, 15.2f)
				};
		// How below assignment works when the Comparator compareTo method expect two arguments, however isEqualBigSmall method from Employee class take only one argument ???
		// This article provide explanation for this... http://baddotrobot.com/blog/2014/02/18/method-references-in-java8/
		Comparator<Employee> comp = Employee::isEqualBigSmall;
		
		Arrays.sort(employees,comp);

		assertEquals("Neeraj should be at first Index", "Neeraj", employees[0].getName());
	}
	
	@Test
	public void testObjectCreationUsingConstructorMethodReference() {
		EmployeeFactory emp = Employee::new; 
		Employee e = emp.create("Sandeep",56,5f);
		assertEquals("Employee should get created with Sandeep", "Sandeep",e.getName());
		
	}
	
	
	@Test
	public void showCollectionsForEachLoopUsage() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Rohit", 35, 12.5f));
		empList.add(new Employee("Neeraj", 35, 12.5f));
		empList.add(new Employee("Vishal", 29, 15.2f));
		empList.forEach((emp) -> System.out.println(emp.getName()));

		// How to print above result(just name of employees) using below syntax
		empList.forEach(System.out::println);
	}
	
	@Test
	public void showBiFunctionalUsage(){
		// BiFunction to demonstrate composite functions 
        // Here it will find the sum of two integers 
        // and then return twice their sum 
        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b; 
  
        // Using addThen() method 
        composite1 = composite1.andThen(x -> 2 * x); 
  
        // Printing the results 
        System.out.println("Composite1 = " + composite1.apply(2, 3)); 
		
	}
	
}