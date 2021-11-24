import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guestList = "";
		String comma = "";
		do {
			System.out.println("Please enter guest name:");
			String name = input.next();
			guestList += comma + name;
			comma = ", ";
			System.out.println("Do you want to enter new guest name:");
			String go = input.next();
			if (go.equalsIgnoreCase("yes")) {
				continue;
			} else {
				break;
			}
		} while (true);

		System.out.println("Guest's list: " + guestList);

	}
}
