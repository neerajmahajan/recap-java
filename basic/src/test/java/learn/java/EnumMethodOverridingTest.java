package learn.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

import static org.junit.Assert.*;

public class EnumMethodOverridingTest {

	@Test
	public void gettingValueOfEnumIntoString() {

		EnumMethodOverriding[] allEnumConstants = EnumMethodOverriding.values();
		for (EnumMethodOverriding constant : allEnumConstants) {
			constant.printMe();
		}

		// assertEquals("Enum toString and name method should return same
		// value", string, name);
	}

	@Test
	public void switchUsage() {

		EnumMethodOverriding constant = EnumMethodOverriding.CONSTANT_1;

		switch (constant) {

		case CONSTANT_1:

		}
	}
}