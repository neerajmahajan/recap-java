package learn.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListOpertionsTest {

	List<String> colours;

	@Before
	public void setUp() {
		colours = new ArrayList<>();
		colours.add("Red");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Pink");
		colours.add("Magenta");
	}

	@After
	public void tearDown() {

		colours = null;
	}

	@Test
	public void testLoopingAList() {
		colours.forEach(System.out :: println);
	}
	
	@Test
	public void testTransformListToMap() {
		Map<String, Integer> collect = colours.
		stream()
		.collect(Collectors.toMap(x -> x, x -> x.length()));
		
		collect.forEach((x,y) -> {
			System.out.println("Key "  + x);
			System.out.println("Key length "  + y);
		});
		
		long count = colours.stream().filter(x -> x.equals("Green")).count();
	}
}
