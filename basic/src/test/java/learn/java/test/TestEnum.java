package learn.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import learn.java.PipelineStage;
import learn.java.PipelineStageWithConstructor;

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

	@Test
	public void pipelineStageWithConstructor() {

		PipelineStageWithConstructor ps = PipelineStageWithConstructor.ARTEFACT_STORE;
		System.out.println(ps.getStageNo());
	}

}
