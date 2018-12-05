package learn.java.test;

import org.junit.Test;

import learn.java.EnumMethodOverriding;

public class EnumMethodOverridingTest {

	@Test
	public void gettingValueOfEnumIntoString() {

		EnumMethodOverriding[] allEnumConstants = EnumMethodOverriding.values();
		
		for (EnumMethodOverriding constant : allEnumConstants) {
			constant.printMe();
		}
	}

	@Test
	public void switchUsage() {

		EnumMethodOverriding constant = EnumMethodOverriding.CONSTANT_1;

		switch (constant) {

		case CONSTANT_1:
			System.out.println("This is constant  " + constant);
			break;
		case CONSTANT_2:
			System.out.println("This is constant  " + constant);
			break;
		case CONSTANT_3:
			System.out.println("This is constant  " + constant);
			break;
		default:
			System.out.println("This will never work ");
		}
	}
}