# Lambda : A lambda is a function
### Lambda Experssion
   * A lambda expression is a function which can be created without belonging to any class. 
   * A lambda expression can be assigned to a functional Interface type, provided that functional interface abstract method signature matches the signature of lambda expressions.

### Method References
  * Reference to a static method.
  * Reference to an instance method of a particular object.
  * Reference to an instance method of an arbitrary object of a particular type.
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
####	Consumer
* It defines an abstract method named accept that takes an object type of generic type T and returns void.

	```
				@FunctionalInterface
				public interface Consumer<T> {
					void accept(T t);
				}
	```

####	Function
*	It defines an abstract method named apply that takes an object of generic type T and returns an object type of generic type R. It can be used to transform an object into another object.

	```
				@FunctionalInterface
				public interface Function<T, R> {
					R apply(T t);
				}				
	```
    
    
    
