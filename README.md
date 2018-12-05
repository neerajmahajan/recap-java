# recap-java
Repository to revise and document Java.

# Repository structure
There will be a separate folder for different topics/features. Please read Readme.md in respective folders for details.

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

##### Reflection TODO
      

