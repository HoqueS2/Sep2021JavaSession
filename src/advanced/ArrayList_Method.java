package advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Method {

	public static void main(String[] args) {
		// Don't need to use .add method 4 times Arrays.asList will add those number in
		// your Arraylist
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		// if you don't want to use for or other loop to print just use this
		System.out.println(numbers + "_______"); // [10, 20, 30, 40]

		int i[] = { 10, 20, 30, 40, 50, 60 }; // array literals another way to create static array
		System.out.println(i); // print memory address gurbase
		System.out.println(Arrays.toString(i) + "......");// another way to print VERY IMPORTANT

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS"));
		System.out.println(names);

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

		System.out.println(l1.equals(l3));// COMPARE TWO ARRAYLIST/ TRUE OR FALSE l1 and l3 are contain same string but
											// in different order that's why its false

		System.out.println(l3 + "******");
		Collections.sort(l3);// SORT THE ARRAYLIST
		System.out.println(l3 + " Sorted l3");
// If you don't sort and compare l1 and l3 .equals become false
		System.out.println(l1.equals(l2));// False
		System.out.println(l1.equals(l3)); // True because your sort first then compare

		if (l1.equals(l3)) {// if your actual result and expected both match print PASS
			System.out.println("PASS");
		}

		// web page --> drop down --> 5 elements ---actuallist
		// expectedlist --> 5 elements

		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

//		l4.removeAll(l5); // 
//		System.out.println(l4);// F

		l5.removeAll(l4);// all the common element that match with l5 and l4 remove from l5
		System.out.println(l5 + " l5 is ");// compare 2 list and find additional element in l5
		System.out.println(l4 + " l4 is ");

		// find out the common elements:

		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "PHP"));

		lang1.retainAll(lang2);
		System.out.println(lang1 + " lang1 and lang2 coomon element are "); // [JAVA, Python, JS, DS]

		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("p", "q", "r"));

//		l6.addAll(l7); // 
//		System.out.println(l6);// [A, B, C, D, F, p, q, r]
//		System.out.println(l7); // [p, q, r]
//
////		l7.clear();
////		System.out.println(l7);
//
//		ArrayList<String> cloneList = (ArrayList<String>) l7.clone();
//		System.out.println(cloneList + "cloneList is");// [p, q, r] cloneList is
//
//		
		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		l8.add(0, "T");
		System.out.println(l8);// [T, A, B, C, D, F]
		// l8.add(10, "N");
		// System.out.println(l8); // IOB Exception
		l8.clear();
		System.out.println(l8);// [] blank

		ArrayList<String> lang4 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo"));
		ArrayList<String> lang5 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo", "PHP"));

		System.out.println(lang4.contains("JAVA"));// True
		System.out.println(lang5.containsAll(lang4));// True

		if (lang5.containsAll(lang4)) {
			System.out.println("PASS");// Pass
		}

	}

}
