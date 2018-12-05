package learn.java;

import org.junit.Test;

import learn.java.Employee;

import static org.junit.Assert.*;

public class EmployeeTest {
	
  @Test
  public void evaluatesExpression() {
	  Employee employee = new Employee("Neeraj",24,45.60f);
	  assertEquals("Employee[name=Neeraj,age=24,salary=45.6,street=<null>]", employee.toString());
	  assertNotNull("Employee shoouldn't be null", employee);
  }
}