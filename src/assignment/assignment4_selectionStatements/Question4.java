package assignment.assignment4_selectionStatements;

public class Question4 {

	public static void main(String[] args) {
		
		double bill, calls;
		calls = 150;

		if (calls < 100) {
		    System.out.println("Your bill is minimum 200$ for up to 100 calls");

		} else if (calls < 150) {
		    bill = ((calls - 100) * 0.60) + 200;
		    System.out.println("Your bill is: " + bill);

		} else if (calls < 200) {
		    bill = ((calls - 150) * 0.50) + (50 * 0.60) + 200;
		    System.out.println("Your bill is: " + bill);

		} else if (calls > 200) {
		    bill = ((calls - 200) * 0.40) + (50 * 0.50) +(50 * 0.60) + 200;
		    System.out.println("Your bill is: " + bill);

		} else {
			System.out.println("Please enter valid number...");
		}

	}

}
