package learn.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestEnum {

	@Test
	public void gettingValueOfEnumIntoString() {

		PipelineStage pStage = PipelineStage.DEPLOY;
		String string = pStage.toString();
		String name = pStage.name();

		assertEquals("Enum toString and name method should return same value", string, name);
	}

	@Test
	public void extractingAllValuesOfEnum() {

		PipelineStage[] values = PipelineStage.values();

		for (PipelineStage pipelineStage : values) {
			System.out.println(pipelineStage);
		}
	}

	@Test
	// Ordinal Value are o based index value
	public void gettingOrdinalValue() {

		PipelineStage[] values = PipelineStage.values();

		for (PipelineStage pipelineStage : values) {
			System.out.print("Constant Value " + pipelineStage);
			System.out.println("     Ordinal Value " + pipelineStage.ordinal());
		}
	}
}
