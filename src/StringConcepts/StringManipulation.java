package StringConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is my java code and I am so happy";

		System.out.println(s.length());// 38
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(37));
		// System.out.println(s.charAt(38));//StringIndexOutOfBoundsException
		// System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException

		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i'));// 2 //1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i') + 1));// 2nd occurrence of i

		System.out.println(s.indexOf("code"));// 16
		System.out.println(s.indexOf("python"));// -1

		String mesg = "Welcome Admin";
		if (mesg.indexOf("Admin") > 0) {
			System.out.println("PASS");
		}

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		String str = "    hello world     ";
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));

		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace('-', '/'));

	}

}
