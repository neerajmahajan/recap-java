package learn.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

import learn.java.EnumMethodOverriding;
import learn.java.PipelineStage;
import learn.java.PipelineStageWithConstructor;

public class TestEnum {

	@Test
	public void gettingValueOfEnumIntoString() {
		
		// can be achieved using name() or toString()

		PipelineStage pStage = PipelineStage.DEPLOY;
		String string = pStage.toString();
		String name = pStage.name();

		assertEquals("Enum toString and name method should return same value", string, name);
	}

	@Test
	public void extractingAllValuesOfEnum() {
		
		//returns array of Enums
		PipelineStage[] values = PipelineStage.values();

		for (PipelineStage pipelineStage : values) {
			System.out.println(pipelineStage);
		}
	}

	@Test
	// Ordinal Value are 0 based index value
	public void gettingOrdinalValue() {
		// ordinal method gives the integer value of the constant starting from 0
		PipelineStage[] values = PipelineStage.values();

		for (PipelineStage pipelineStage : values) {
			System.out.print("Constant Value " + pipelineStage);
			System.out.println("     Ordinal Value " + pipelineStage.ordinal());
		}
	}

	@Test
	public void pipelineStageWithConstructor() {

		PipelineStageWithConstructor ps = PipelineStageWithConstructor.ARTEFACT_STORE;
		System.out.println(ps.getStageNo());
	}

	@Test
	public void inputValueExistInTheDefinedPipeline() {
		
		String inputValue = "DEPLOY";
		boolean valueExist = false;

		for (PipelineStage pl : PipelineStage.values()) {
			// name method on enum returns the string representation
			if(pl.name().equals(inputValue)){
				valueExist = true;
				break;
			}

		}
		org.junit.Assert.assertTrue(valueExist);
	}
	
	@Test
	public void useOfValueOfToConvertStringToEnumObject() {
		
		String inputValue = "DEPLOY";
		org.junit.Assert.assertTrue(PipelineStage.valueOf(inputValue) instanceof PipelineStage );
	}
	
	@Test
	public void switchUsage() {

		EnumMethodOverriding constant = EnumMethodOverriding.CONSTANT_1;

		switch (constant) {

		case CONSTANT_1:
			assertEquals("Enums should match", EnumMethodOverriding.CONSTANT_1, constant);
			break;
		case CONSTANT_2:
			Assert.fail();
			break;
		case CONSTANT_3:
			Assert.fail();
			break;
		default:
			System.out.println("This will never work ");
		}
	}
	
	@Test
	public void testOverriding() {

		EnumMethodOverriding constant1 = EnumMethodOverriding.CONSTANT_1;
		EnumMethodOverriding constant2 = EnumMethodOverriding.CONSTANT_2;
		Assert.assertNotEquals("PrintMe method is overriden and should have different message", constant1.constantValue(),constant2.constantValue());

	}

}
