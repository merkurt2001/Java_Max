import java.util.*;

public class VideoGame {

	public static void main(String[] args) {
		int coupons, candies, gumballs;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		coupons = scan.nextInt();
		candies = coupons / 10;
		gumballs = coupons % 10 / 3;
		if (coupons < 3) {
			System.out.println("Not enough coupons");
		} else {
			System.out.println("Number of Candies: " + candies);
			System.out.println("Number of Gumballs: " + gumballs);
			scan.close();
		}
	}

}
