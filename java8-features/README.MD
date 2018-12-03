# Lambda : A lambda is a function
### Lambda Experssion
   * A lambda expression is a function which can be created without belonging to any class. 
   * A lambda expression can be assigned to a functional Interface type, provided that functional interface abstract method signature matches the signature of lambda expressions.

#### Difference between lambda and anonymous inner class
* An annonymous inner class overrides the this reference, whereas in lambda 'this' reference is not modified. 

### Method References
  * Reference to a static method.
  * Reference to an instance method of a particular object.
  * Reference to an instance method of an arbitrary object of a particular type supplied later.
  * Reference to constructor.

###	Common Functional Interfaces
#####	Predicate
* It defines an abstract method test that takes object of generic type T and returns a boolean.
	
	```
				@FunctionalInterface
				public interface Predicate<T> {
					boolean test(T t);
				}
	```
#####	Consumer
* It defines an abstract method named accept that takes an object type of generic type T and returns void.

	```
				@FunctionalInterface
				public interface Consumer<T> {
					void accept(T t);
				}
	```

#####	Supplier	
* * It defines an abstract method named get and returns an generic object of type T.

	```
				@FunctionalInterface
				public interface Supplier<T>	{	
					T get()
				}
	```

#####	Function
*	It defines an abstract method named apply that takes an object of generic type T and returns an object type of generic type R.
*	It also has a default compose method, that if used, is called first before function is called.
* It can be used to transform an object into another object.

	```
				@FunctionalInterface
				public interface Function<T, R> {
					R apply(T t);
				}				
	```
	
	
#####	BiFunction
* It defines an abstract method named apply that takes two arguments of generice type T and U and return a generic type of R.
* It also has andThen method that accept a function argument and return a Bifunction Object. It is used to chain functions, in which first of all BiFunction apply is called and then the addThen function will be called on the return value of BiFunction and so on...

	```
			@FunctionalInterface
			public interface BiFunction<T, U, R> {
				R apply(T t, U u);
				
				default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
    			}
			}
			
	```

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
