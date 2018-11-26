package lambda.learning;

public class Employee implements Comparable<Employee>{
	
	private String name ;
	private int age;
	private float salary;
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getSalary() {
		return salary;
	}

	public Employee(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Name " + name + " Age " + age + " Salary " + salary;
	}


	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}