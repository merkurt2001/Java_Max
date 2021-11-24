import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int itemPrice, change, quarters, dimes, nickels;
		System.out.println("Enter price in cents:");
		itemPrice = scan.nextInt();

		if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
			System.out.println("Invalid price!");
		} else {
			change = 100 - itemPrice;
			quarters = change / 25;
			dimes = change % 25 / 10;
			nickels = change % 25 % 10 / 5;
			System.out.println(
					"Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
			scan.close();
		}
	}
}