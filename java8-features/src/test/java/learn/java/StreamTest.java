package learn.java;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {

	@Test
	public void testStreamCreationUsingArrayList() {

		List<String> nameList = new ArrayList<String>(Arrays.asList("Neeraj", "Vishal", "Rohit", "Nitin"));
		Stream<String> nameStream = nameList.stream();

		Stream<String> filteredStream = nameStream.filter(name -> name.startsWith("N"));

		Stream<String> mappedStream = filteredStream.map((x) -> x.toUpperCase());
		
		List<String> upercaseString = mappedStream.collect(Collectors.toList());

		upercaseString.forEach(System.out::println);

	}
	
	@Test
	public void testStreamCreationUsingSet() {

		Set<String> nameSet = new HashSet<String>(Arrays.asList("Neeraj", "Vishal", "Rohit", "Nitin"));
		
		Stream<String> nameStream = nameSet.stream();
		Stream<String> filteredStream = nameStream.filter(name -> name.startsWith("N"));

		Stream<String> mappedStream = filteredStream.map((x) -> x.toUpperCase());
		
		List<String> upercaseString = mappedStream.collect(Collectors.toList());

		upercaseString.forEach(System.out::println);

	}
	
	@Test
	public void testStreamCreationUsingMap() {

		Map<String,String> nameMap = new HashMap<String,String>();
		nameMap.put("Name", "Neeraj");
		nameMap.put("Age", "35");
		nameMap.put("Gender", "Male");
		Set<Entry<String, String>> entrySet = nameMap.entrySet();
		Stream<Entry<String, String>> mapStream = entrySet.stream();
		Stream<Entry<String, String>> filteredStream = mapStream.filter(x -> x.getValue().startsWith("N"));

		Stream<String> mappedStream = filteredStream.map((x) -> x.setValue(new StringBuilder(x.getValue()).reverse().toString()));
		
		List<String> upercaseString = mappedStream.collect(Collectors.toList());

		upercaseString.forEach(System.out::println);

	}

	@Test
	public void testStreamCreationUsingStreamOf() {

		Stream<String> nameStream = Stream.of("heelo", "world", "how", "are");

		List<String> upercaseString = nameStream.map((x) -> x.toUpperCase()).collect(Collectors.toList());

		upercaseString.forEach(System.out::println);

	}

	@Test
	public void testStreamCreationFromFile() throws IOException {
		Stream<String> fileStream = Files.lines(Paths.get("src/main/resources/data.txt"));
		
		List<String> upercaseString = fileStream.map((x) -> x.toUpperCase()).collect(Collectors.toList());
		upercaseString.forEach(System.out::println);

	}

	@Test
	public void testStreamCreationFromFileString() throws IOException {
		String wholeFile = new String(Files.readAllBytes(Paths.get("src/main/resources/data.txt")),
				StandardCharsets.UTF_8);
		
		Stream<String> stringStream = Stream.of(wholeFile.split("/n"));
		List<String> upercaseString2 = stringStream.map((x) -> x.toLowerCase())
				.collect(Collectors.toList());
		upercaseString2.forEach(System.out::println);

	}
}