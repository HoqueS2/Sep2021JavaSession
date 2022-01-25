package advanced;

// This code is a backend code not UI code
// Frontend is releted to html, css, browser
import java.util.ArrayList;

public class Customer {
	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("searching the product: " + categoryName);
		ArrayList<String> prodList = new ArrayList<String>();

		switch (categoryName) {
		case "Apple":
			prodList.add("iph12");
			prodList.add("macbook pro");
			prodList.add("ipad mini");
			break;

		case "Samsung":
			prodList.add("s8");
			prodList.add("samsung tablet");
			break;

		case "HP":
			prodList.add("headphone");
			prodList.add("HP laptop");
			break;

		default:
			System.out.println("product cateogy not found...." + categoryName);
			break;
		}

		return prodList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		ArrayList<String> appleList = c1.doSearch("Apple");
		System.out.println(appleList.size());
		System.out.println(appleList);

		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println(samsungList.size());
		System.out.println(samsungList);
		for (String e : samsungList) {
			System.out.println(e);
		}

		ArrayList<String> nokiaList = c1.doSearch("Nokia");
		System.out.println(nokiaList.size());// physical size 0
		System.out.println(nokiaList);// print blank

	}

}
