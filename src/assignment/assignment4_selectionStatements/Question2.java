package assignment.assignment4_selectionStatements;

public class Question2 {

	public static void main(String[] args) {
		
		int income=1200000;

		double taxAmount_1 = income * 0.25;
		double taxAmount_2 = ((income - 150000000) * 0.30) + (150000000 * 0.25);
		double taxAmount_3 = ((income - 300000000) * 0.35) + taxAmount_2;
		double taxAmount_4 = ((income - 600000000) * 0.40) + taxAmount_2 + taxAmount_3;
		double taxAmount_5 = ((income - 1200000000) * 0.50) + taxAmount_2 + taxAmount_3 + taxAmount_4;

		if (income <= 150000000) {
		    System.out.println("Your income: " + income);
		    System.out.println("The tax amount is you have to pay: " + taxAmount_1);

		} else if(income <= 300000000) {
			System.out.println("Your income: " + income);
			System.out.println("The tax amount is you have to pay: " + taxAmount_2);

		} else if(income <= 600000000) {
			System.out.println("Your income: " + income);
			System.out.println("The tax amount is you have to pay: " + taxAmount_3);

		} else if(income <= 1200000000) {
			System.out.println("Your income: " + income);
			System.out.println("The tax amount is you have to pay: " + taxAmount_4);

		} else if(income > 1200000000) {
			System.out.println("Your income: " + income);
			System.out.println("The tax amount is you have to pay: " + taxAmount_5);

		} else {
			System.out.println("Please enter valid income...");
		}

	}

}
