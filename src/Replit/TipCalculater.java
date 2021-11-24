import java.util.*;

public class TipCalculater {

	public static void main(String[] args) {
		int numberOfPeople;
		String ServiceQ;
		double checkAmount, totalPerPerson, totalToPay, tipPerPerson;
		double totalTip = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		String Split = scan.next();
		if (Split.equals("Yes")) {
			System.out.println("Number of people:");
			numberOfPeople = scan.nextInt();

			System.out.println("Check amount:");
			checkAmount = scan.nextDouble();
			System.out.println("Service Quality:");
			ServiceQ = scan.next();

			if (ServiceQ.equals("Poor")) {
				totalTip = checkAmount * 0.05;
			} else if (ServiceQ.equals("Fair")) {
				totalTip = checkAmount * 0.10;
			} else if (ServiceQ.equals("Good")) {
				totalTip = checkAmount * 0.15;
			} else if (ServiceQ.equals("Great")) {
				totalTip = checkAmount * 0.20;
			} else if (ServiceQ.equals("Excellent")) {
				totalTip = checkAmount * 0.25;
			}

			tipPerPerson = totalTip / numberOfPeople;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberOfPeople;
			System.out.print("Number of people entered: ");
			for (int i = 0; i < numberOfPeople; i++)
				System.out.print("&");
			System.out.println("");

			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		}
		scan.close();
	}

}
