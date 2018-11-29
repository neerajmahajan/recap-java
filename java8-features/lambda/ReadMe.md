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
    
    
