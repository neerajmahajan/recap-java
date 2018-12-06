#### Equals method contract
* For any non‐null reference value x, x.equals(null) should return false.
*	It is reflexive: For any non‐null reference value x, x.equals(x) should return true.
* It is symmetric: For any non‐null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
* It is transitive: For any non‐null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
* It is consistent: For any non‐null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.

##### Hashcode method in Object
* By default Object.hashcode is derived from memory location.
* Override hashCode whenever you override equals.
*	Within the same program, the result of hashCode() must not change. This means that you shouldn’t include variables that change in figuring out the hash code.
* If equals() returns true when called with two objects, calling hashCode() on each of
those objects must return the same result. This means hashCode() can use a subset of the variables that equals() uses. 
* If equals() returns false when called with two objects, calling hashCode() on each of those objects does not have to return a different result. This means hashCode() results do not need to be unique when called on unequal objects.
*	All of the instance variables don’t need to be used in a hashCode() method. It is common not to include boolean and char variables in the hash code
  eg Employee class does employee object comparison based on age,name,salary then use like below
```
  public int hasCode(){
  return Objects.hash(age,name,salary);
```

##### Enums
* An enum is a class that represents an enumeration. 
* An enumeration is a fixed set of constant values.
* It is better to use enum instead of plain constant as it provide type safety.
* We can have constructors, methods and field for enum constants.
* We can have multiple constructors in an Enum with different number of arguments.
* We can override methods for different constant values.
* name() and toString() method returns string value of the constant.
* ordinal() method retruns the integer value of the constant declaration order.
* values() methods returns the enum array of all constants.
* EnumType.value("string") method is used to get the enum object from string value.

##### Nested Classes
* Memeber Inner Class
* Static Class
* Anonymous Inner Class
* Class inside a method (local inner class)

#### Benefits
* They can encapsulate helper classes by restricting them to the containing class.
* They can make it easy to create a class that will be used in only one place.


#### Member Inner Class
* A member inner class is defined at the member level of a class.
* Can be declared public, private, or protected or use default access.
* Can be abstract or final.
* Cannot declare static fields or methods.
* Can access members of the outer class including private members (IMPORTANT POINT)
* To create inner class instance use or return it via outer class method
```
    Outer outer = new Outer();
		Inner inner = outer.new Inner();
 ```
 * If the inner class defined an instance variable with the same name which outer class has defined then inner class needs to use below systax
 ```
 public class A {
  private int x = 10;
   class B {
   private int x = 20;
   class C {
   private int x = 30;
   public void allTheX() {
   System.out.println(x); // 30
   System.out.println(this.x); // 30
   System.out.println(B.this.x); // 20
   System.out.println(A.this.x); // 10
   }
   }
   }
   public static void main(String[] args) {
   A a = new A();
   A.B b = a.new B();
   A.B.C c = b.new C();
   c.allTheX();
   }}
 
 ```
 
 #### Local Inner Classes
 * A local inner class is a nested class defined within a method.
 * You can create instances only from within the method.But those instances can still be returned from the method.
 * They have access to all fields and methods of the enclosing class.
 * They do not have access to local variables of a method unless those variables are finalor effectively final.
 
 ####	Anonymous Inner Classes
 * An anonymous inner class is a local inner class that does not have a name.
 * Anonymous inner classes are required to extend an existing class or implement an existing interface.
 * They are useful whenyou have a short implementation that will not be used anywhere else
