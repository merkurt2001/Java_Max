package assignment.lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		 

		System.out.println("Please enter the charge for the meal");

		double bill = scan.nextDouble();

		double tax, tip, total;

		 

		tax = 0.0675 * bill;

		total = bill + tax;

		tip = 0.2 * total;

		 

		System.out.println("Your bill is $ " + (bill+tax+tip) + "\n" + "Your tax is $ " + tax + "\n" + "Tip for staff $ " + tip);

	}

}
