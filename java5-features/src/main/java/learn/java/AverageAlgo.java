package learn.java;

public class AverageAlgo {

public static <T> T getMiddle(T... args){
		return args[args.length/2]; 
	}

public static <T extends Comparable> int equate (T a, T b) {
	
	return a.compareTo(b);
}

public static void main(String[] args) {
	
	String middleName = AverageAlgo.getMiddle("Neeraj","Rohit","Vishal");
	System.out.println(middleName);
	
	int x = AverageAlgo.equate(new Person(), new Person());
	System.out.println(x);
}
}



