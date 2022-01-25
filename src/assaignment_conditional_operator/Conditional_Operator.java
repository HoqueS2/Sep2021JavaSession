package assaignment_conditional_operator;

import java.util.Scanner;

public class Conditional_Operator {

	public static void main(String[] args) {
		// *************** #1 ********************
		Scanner in = new Scanner(System.in);

		System.out.print("Input the 1st number: ");
		int num1 = in.nextInt();

		System.out.print("Input the 2nd number: ");
		int num2 = in.nextInt();

		System.out.print("Input the 3rd number: ");
		int num3 = in.nextInt();

		if (num1 > num2 && num1 > num3)
			System.out.println("The greatest: " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("The greatest: " + num2);
		else if (num3 > num1 && num3 > num2)
			System.out.println("The greatest: " + num3);
		else
			System.out.println("default");

		// 25 78 87
		System.out.println();
		// *************** #2 ********************
		System.out.println("Enter your number to test positive or negetive");
		int number = in.nextInt();
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else {
			System.out.println(number + " is a negetive number");
		}

	}

}
