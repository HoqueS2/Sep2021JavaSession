package advanced;

public class Customres {
	String name;
	int id;
	static String city = "Bangalore";
	static String paymentMethod = "CC";

	public void getInfo() {
		System.out.println("get info....");
	}

	public static void sendMail() {
		System.out.println("send mail....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customres obj = new Customres();

		// how to call static methods:
		// 1. call directly:
		sendMail();
		obj.getInfo();

		// 2. using class name:
		Customres.sendMail();

		// 3. using obj ref:
		obj.sendMail();
	}

}
