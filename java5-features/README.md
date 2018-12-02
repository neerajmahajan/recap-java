#####	Generic Class / Methods

* To restrict the type for a class or method , we can extend the type. eg if we want generic type should only accecpt types that have implemented Comparable, then we can define like <T extends Comparable>
* We can also extend the type with multiple interfaces. eg <T extends Comparable & Clonable>  
* Java virtual machine has no notion of generic type or methods.
* Generic classes and methods turns into ordinary classes and methods.
* Type variables are erased, yielding a raw type.
* Raw type is Object or first type bound. (First type bound means if a type is extending some type, then the first type is used instead of Object)
* The compiler inserts a cast when a return type has been erased.---
* Casts are not needed for erased parameter types.
* Cast is required in case of multiple bounds. eg type extends multiple classes or interfaces.

```
public class AverageAlgo {

public static <T> T getMiddle(T... args){
		return args[args.length/2];
	}

String middle = AverageAlgo.<String>getMiddle("Hello","World",);

or 

// Compiler will infer the generic type from the parameter type and return type.
String middle = AverageAlgo.getMiddle("Hello","World",);

``` 