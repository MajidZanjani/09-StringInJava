package javaToString;

public class Employee {

	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	// Comment this section and you will see the Employee HashCode in the output.
	public String toString() { 
		return this.id + " " + this.name + " " + this.age;
	}

}
