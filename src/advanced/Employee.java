package advanced;

public class Employee {
	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;
	char gender;

	public static void main(String[] args) {// JVM will start execute the program from main method
		// TODO Auto-generated method stub
		Employee e1 = new Employee();

		// e1 -> object reference name
		// RHS -> new Employee(); - is the Object
		// Employee -> class/ type of t1
		// Employee is a non primitive data type

		e1.name = "Tom";
		e1.age = 25;
		e1.city = "Delhi";
		e1.salary = 12.33;
		e1.isPerm = true;

		System.out.println(e1.name + " " + e1.age + " " + e1.city);

		Employee e2 = new Employee();
		e2.name = "Peter";
		System.out.println(e2.name + " " + e2.age + " " + e2.city + " " + e2.salary + " " + e2.isPerm);
		System.out.println(e2.gender);

	}// By Defaule
		// String = null;
		// int = 0;
		// double = 0.0;
		// boolean = false;
		// char = empty space or one space;

}
