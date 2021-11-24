import java.util.Scanner;

public class OnlineBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (nbooksPurchased > 4) {
			if (isPremiumCustomer) {
				freeBooks = 1;
				if (nbooksPurchased > 7) {
					freeBooks = 2;
				}
			} else {
				freeBooks = 0;
				if (nbooksPurchased > 6) {
					freeBooks = 1;
				}
				if (nbooksPurchased > 11) {
					freeBooks = 2;
				}

			}
		} else {
			freeBooks = 0;
		}
		System.out.println(freeBooks);

	}
}
