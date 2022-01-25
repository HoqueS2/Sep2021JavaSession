package loop_assignment;

public class All_About_Loop {

	public static void main(String[] args) {
		// *************** #1 ********************
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Wonder Women");
		}
		System.out.println();
		// ************** #2 ***********************

		for (int i = 1; i < 10; i++) {
			System.out.println("I am Wonder Women " + i);
		}
		System.out.println();
		// ************** #3 ***********************
		// while loop
		System.out.println("Here is while loop");
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println();

		System.out.println("Here is do while loop");
		i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
		System.out.println();

		// *************** #4 ********************
		System.out.println("Here is while loop");
		int j = 0;
		while (j < 10) {
			System.out.println("Hello World");
			j++;
		}
		System.out.println();

		// *************** #5 ********************
		System.out.println("Here is while loop");
		int k = 1;
		while (k < 10) {
			if (k % 7 == 0) {
				System.out.println(k + " is multiple by 7");
				break;
			}
			System.out.println(k);
			k++;
		}
		System.out.println("FINISH");

	}

}
