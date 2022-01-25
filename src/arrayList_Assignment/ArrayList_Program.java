package arrayList_Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program {

	public static void main(String[] args) {
//*********************** 1 *****************************************
// 1. Write a Java program to create a new array list, add some colours (string) and print out the collection
		ArrayList<String> colour_Strings = new ArrayList<String>();
		colour_Strings.add("Red");
		colour_Strings.add("Green");
		colour_Strings.add("Orange");
		colour_Strings.add("White");
		colour_Strings.add("Black");
		System.out.println(colour_Strings);
		System.out.println();
//*********************** 2 *******************************************
// 2. Write a Java program to insert an element into the array list at the first and last positions.

		colour_Strings.add(0, "Purple");
		colour_Strings.add(6, "Megenda");
		System.out.println(colour_Strings);
		System.out.println();
//*********************** 3 *******************************************
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		// Retrive the first and third element
		String find1 = colour_Strings.get(0);
		System.out.println("First element: " + find1);
		find1 = colour_Strings.get(2);
		System.out.println("Third element: " + find1);
		// *********************** 4 *******************************************
//4. Write a Java program to update specific array element by given element.
		System.out.println();
		// Update the third element with "Yellow"
		colour_Strings.set(2, "Yellow");
		// Print the list again
		System.out.println(colour_Strings);
		System.out.println();
//*********************** 5 *******************************************
//5. Write a Java program to remove the third element from a array list. 
		colour_Strings.remove(2);
		System.out.println(colour_Strings);
		System.out.println();
		// *********************** 6 *******************************************
//6. Write a Java program to search an element in a array list.
		// Search the value Red
		if (colour_Strings.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		System.out.println(colour_Strings.contains("Red"));
		// colour_Strings.contains("Red");

//*********************** 7 *******************************************
//7. Write a Java program to reverse elements in a array list
		Collections.reverse(colour_Strings);
		System.out.println(colour_Strings);
		System.out.println();
//*********************** 8 *******************************************
//8 Write a Java program to extract a portion of a array list.
		ArrayList<String> al2 = new ArrayList<String>(colour_Strings.subList(0, 4));
		System.out.println("SubList stored in ArrayList: " + al2);
		System.out.println();
//*********************** 9 *******************************************
//9. Write a Java program of swap two elements in an array list.
		// Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(al2, 0, 2);
		System.out.println(al2);
		System.out.println();
//*********************** 10 *******************************************
//10. Write a Java program to empty an array list.
		al2.clear();
		System.out.println(al2);
		System.out.println();
//*********************** 11 *******************************************
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
		colour_Strings.trimToSize();
		System.out.println("After trim the VC of colour_Strings is " + colour_Strings);
		System.out.println();

//*********************** 12 *******************************************
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		for (int index = 0; index < colour_Strings.size(); index++)
			System.out.println(index + " [" + colour_Strings.get(index) + "]");
	}

}// DONE
