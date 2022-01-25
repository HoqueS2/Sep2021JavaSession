package array_assignment;

public class All_About_Array {

	public static void main(String[] args) {

		/*
		 * Question 1: Write a program to print the following pattern using for loop: 00
		 * 01 02 03 04 05 06 07 08 09  10 11 12 13 14 15 16 17 18 19  20 21 22 23 24 25
		 * 26 27 28 29  30 31 32 33 34 35 36 37 38 39 
		 */
//********************* 1 **********************************
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		System.out.println();
//********************* 2 **********************************
		Object[] emp1 = new Object[] { "RM", 21, "SkyBlue", "09-20-2000", 'M', 12.00, true };
		Object[] emp2 = new Object[] { "JK", 20, "SkyBlue", "11-22-2001", 'M', 19.00, true };
		for (int i = 0; i < emp1.length; i++) {
			System.out.print(emp1[i] + " ");
			// System.out.println(emp2[i]);
		}
		System.out.println();
		for (Object e : emp2) {
			System.out.print(e + " ");
		}
		System.out.println();
		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name(String), age(age), team name(String), DOB(String),
		 * gender(char), Strike Rate(Double), isActive(boolean) --Try to create multiple
		 * Object Arrays for different players  --Try to print all the values of each
		 * player on the console using normal for/while loop and for  each loop
		 */
//********************* 3 **********************************
		for (int i = 4; i >= 0; i--) {
			System.out.println("n = " + "" + i);
		}
		/*
		 * n = 4 n = 3 n = 2 n = 1 n = 0
		 */
	}

}
