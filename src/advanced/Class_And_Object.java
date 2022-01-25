package advanced;

public class Class_And_Object {
	int i = 20;// class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;// local variable
		System.out.println(i);

		// create the object of the class: use new keyword
		Class_And_Object obj = new Class_And_Object();
		System.out.println(obj.i);

		// class - template / blueprint / category for the objetcs
		// will have class properties which will be used to create the objects
		// objetcs - physical entity should be created from the class category/template

	}

}
