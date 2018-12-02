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

#####	Streams
* A stream is superficially similar to collection, but a stream does not store its elements.
*	A stream fetches elements on demand.
* Stream operators don't mutate their source.
* A stream operations yields another stream(eg filter) or a result(collect).
* Stream operations are lazy when possible.

######	 Stream workflow
*	create a stream
*	transform with intermediate operations.
	* each step yield another stream.
	*	Nothing is computed yet.
*	Produce result with terminal operation.
	* forces execution of lazy operations.
	*	Afterwards streams can no longer be used. 

######	Creating a stream
* Turn any collection into stream
	* 	Stream<T> stream = collection.stream();
* Turn any array objects into stream
	* Stream<T>	stream =	Stream.of(array).
* Stream.of is a vargs method
	* Stream<String> stream = Stream.of("gently","down","the","Stream");
* Stream.empty makes an empty stream
	* Stream<String> silence = Stream.empty();

	
*
