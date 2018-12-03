package learn.java;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {
	
  @Test
  public void streamCreation() {
	  
	  Stream<String> strings = Stream.of("heelo","world","how","are");
	  
	  List<String> upercaseString = strings.map((x) -> x.toUpperCase()).collect(Collectors.toList());
	  
	  upercaseString.forEach(System.out :: println);
	  
  }
  
  
  @Test
  public void streamCreationFromFile() {
	  
	 
	try {
		 Stream<String> strings = Files.lines(Paths.get("src/main/resources/data.txt"));
		 
		 List<String> upercaseString = strings.map((x) -> x.toUpperCase()).collect(Collectors.toList());
		 upercaseString.forEach(System.out :: println);
		 
		 
		 
		 String wholeFile = new String(Files.readAllBytes(Paths.get("src/main/resources/data.txt")), StandardCharsets.UTF_8);
		 List<String> upercaseString2 = Stream.of(wholeFile.split("/n")).map((x) -> x.toLowerCase()).collect(Collectors.toList());
		 upercaseString2.forEach(System.out :: println);
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 
	  
  }
}