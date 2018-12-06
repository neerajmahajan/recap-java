package learn.java.test;

import org.junit.Test;

import learn.java.Outer;
import learn.java.Outer.Inner;
import learn.java.Outer.InnerStatic;

public class TestInner {

	@Test
	public void testCreationOfInnerWithDefaultScope() {

		Outer outer = new Outer();

		/*
		 * InnerWithDefaultScope inner = outer.new InnerWithDefaultScope();
		 * 
		 * InnerWithDefaultScope innerInstanceThroughMethod =
		 * outer.returnInnerWithDefaultScope();
		 * 
		 */

		// Above statements will result in Compiler Error can't create inner
		// class, because it has default scope in Outer class

	}

	@Test
	public void testInnerClassCreation() {

		Outer outer = new Outer();
		Inner inner = outer.new Inner();

		Inner innerInstanceThroughMethod = outer.returnInner();
	}
	
	@Test
	public void testInnerStaticClassCreation() {

		InnerStatic innerStatic = new Outer.InnerStatic();
	}
}
