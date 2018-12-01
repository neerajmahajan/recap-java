##### Addition in Interfaces
    * An interface can now have static methods.
    * An Interface can now also have default methods. (Means methods with implementations).
    * A default method can call abstract methods.
    * when a class implements multiple interfaces and same default method is provided by multiple interfaces then compiler fails and concrete class needs to provide the implementation. Or concrete class can chose the implementation from one of the interfaces. However if default method is provided in one of the super class then that get resolved(used) 
    * If one interface has provided default implementation and other has declared it abstract, then also if a class is implementing both interface then implementation needs to defined in that class.
    
```
Class Student implements Person, Human {
public String getName(){
   return Person.super.getName();  
   }
}
````


#####	Closures in Java

*	Variables which are accessed in lambda expression or anonymous inner class from enclosing scope are called closures. Below 'a' is a closure that will be accessible even after the call to test method completes. 

```
public Consumer<String> test(String a, String b) {

	Consumer<String> con = a -> System.out.println(a)'
	return con;
	}
```

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
