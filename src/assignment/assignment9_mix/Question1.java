package assignment.assignment9_mix;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		tipCalculator();
	}
	
	public static void tipCalculator() {
		String people = "&";
		double totalPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Split:");
		String split = scan.nextLine();

		System.out.println("Number of people:");
		int numberPeople = scan.nextInt();

		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		
		if (split.equalsIgnoreCase("yes")) {
			if (serviceQuality.equalsIgnoreCase("Poor")) {
				totalTip = checkAmount * 0.05;
			}

			else if (serviceQuality.equalsIgnoreCase("Fair")) {
				totalTip = checkAmount * 0.1;
			}

			else if (serviceQuality.equalsIgnoreCase("Good")) {
				totalTip = checkAmount * 0.15;
			}

			else if (serviceQuality.equalsIgnoreCase("Great")) {
				totalTip = checkAmount * 0.2;
			}

			else if (serviceQuality.equalsIgnoreCase("Excellent")) {
				totalTip = checkAmount * 0.25;
			}

		}

		totalPay = checkAmount + totalTip;
		totalPerPerson = totalPay / numberPeople;
		tipPerPerson = totalTip / numberPeople;

		System.out.print("Number of people entered: ");

		for (int i = 1; i <= numberPeople; i++) {
			System.out.print(people);
		}

		System.out.println();

		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

	}

}
