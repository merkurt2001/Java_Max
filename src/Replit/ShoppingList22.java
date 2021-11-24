import java.util.Scanner;

public class ShoppingList22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		String comma = "";

		while (count <= 10) {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			shoppingListReport += comma + "Item" + count + ": " + item + " Price: " + price;
			comma = ", ";
			System.out.println("Add one more item?");
			String goNogo = scan.next();
			if (goNogo.equalsIgnoreCase("yes")) {
				count++;
				continue;
			} else {
				break;
			}

		}
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);

	}
}