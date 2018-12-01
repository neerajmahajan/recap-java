#####	Generic Methods
```
Class AverageAlgo {

public static <T> T getMiddle(T... args){
		return args[args.length/2];
	} 
}

String middle = AverageAlgo.<String>getMiddle("Hello","World",);

or 

// Compiler will infer the generic type from the parameter type and return type.
String middle = AverageAlgo.getMiddle("Hello","World",);

``` 