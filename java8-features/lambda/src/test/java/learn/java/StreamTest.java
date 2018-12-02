package learn.java;

import org.junit.Test;

import learn.java.Employee;

import static org.junit.Assert.assertNotNull;

public class StreamTest {
	
  @Test
  public void streamCreation {
	  
	  Stream<String> strings = Stream.of("heelo","world","how","are");
	  
	  strings.m
	  
	  
	  Employee employee = new Employee("Neeraj",24,45.60f);
	  assertNotNull("Employee shoouldn't be null", employee);
  }
}