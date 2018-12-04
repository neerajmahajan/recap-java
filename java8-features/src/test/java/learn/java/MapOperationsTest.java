package learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapOperationsTest {

	Map<String, Integer> colourCodes;

	@Before
	public void setUp() {

		colourCodes = new HashMap<>();
		colourCodes.put("Red", 1);
		colourCodes.put("Green", 2);
		colourCodes.put("Blue", 3);
		colourCodes.put("Yellow", 4);
		colourCodes.put("Pink", 5);
		colourCodes.put("Magenta", 6);

	}

	@After
	public void tearDown() {

		colourCodes = null;
	}

	@Test
	public void testLoopingAMap() {
		colourCodes.forEach((key, value) -> {

			System.out.println(key);
			System.out.println(value);

		});
	}

	@Test
	public void testFilteringMapByKey() {
		Set<Entry<String, Integer>> entrySet = colourCodes.entrySet();

		Stream<Entry<String, Integer>> stream = entrySet.stream();

		Stream<Entry<String, Integer>> filteredStreamByKey = stream.filter(x -> x.getKey().contains("e"));
		
		filteredStreamByKey.forEach(x -> {

			System.out.print(x.getKey() + "###");
			System.out.println(x.getValue());
		});
	}

	@Test
	public void testFilteringMapByValue() {
		Set<Entry<String, Integer>> entrySet = colourCodes.entrySet();

		Stream<Entry<String, Integer>> stream = entrySet.stream();

		Stream<Entry<String, Integer>> filteredStreamByKey = stream.filter(x -> x.getValue() % 2 == 0);

		filteredStreamByKey.forEach(x -> {

			System.out.print(x.getKey() + "###");
			System.out.println(x.getValue());
		});
	}

	@Test
	public void testMapToListOfKeys() {
		Set<Entry<String, Integer>> entrySet = colourCodes.entrySet();

		Stream<Entry<String, Integer>> stream = entrySet.stream();

		// Remove key with Yellow from map
		Stream<Entry<String, Integer>> filteresStream = stream.filter(x -> x.getKey().compareTo("Yellow") != 0);

		Stream<String> keysStream = filteresStream.map(entry -> entry.getKey());

		List<String> keyList = keysStream.collect(Collectors.toList());

		assertTrue("Keys List shouldn't contain Yellow", !keyList.contains("Yellow"));
		assertEquals("Size should be 5", 5, keyList.size());

	}

	@Test
	public void testMapToListOfValues() {
		Set<Entry<String, Integer>> entrySet = colourCodes.entrySet();

		Stream<Entry<String, Integer>> stream = entrySet.stream();

		Stream<Integer> valueStream = stream.map(entry -> entry.getValue());

		List<Integer> valueList = valueStream.collect(Collectors.toList());

		assertTrue("Values should contain 1 to 6",
				valueList.containsAll(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6))));
		assertEquals("Size should be 6", 6, valueList.size());
	}

	@Test

	public void testTransformMapToMap() {
		Set<Entry<String, Integer>> entrySet = colourCodes.entrySet();

		Stream<Entry<String, Integer>> stream = entrySet.stream();

		// this example similar to spark mapValues- Key will remain constant, we
		// are applying function on values
		Map<String, Integer> transformedMap = stream
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue() * 2));

		transformedMap.forEach((key, value) -> {

			System.out.println("Key :: " + key);
			System.out.println("Value :: " + value);
		});
		
	}
	
	@Test
	public void testComp() {
		
		Comparator<String> strC = (x,y) -> {
			
			System.out.println("6666666666666");
			System.out.println(this);
			System.out.println(equals(x));
			System.out.println("6666666666666");
			return x.compareTo(y);
		};
		
		strC.compare("Hi", "Hi");
	}
	
	@Test
	public void testCompAnonymous() {
		
		Comparator<String> str = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("55555555555555555555");
				System.out.println(this);
				System.out.println(equals(o1));
				System.out.println("55555555555555555555");
				return o1.compareTo( o2);
			}
		};
		
		str.compare("Hi", "Hi");
	}
	
	

}