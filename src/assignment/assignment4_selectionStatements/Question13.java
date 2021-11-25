package assignment.assignment4_selectionStatements;

public class Question13 {

	public static void main(String[] args) {
		
;
		int checkNumber = 30;
		int baseFee=10;

		double totalFee;

		if (checkNumber < 20) {
			totalFee = baseFee + (checkNumber * 0.1);
			System.out.println("Total Fee is $" + totalFee);
		} else if (checkNumber < 40) {
			totalFee = baseFee + (checkNumber * 0.08);
			System.out.println("Total Fee is $" + totalFee);
		} else if (checkNumber < 60) {
			totalFee = baseFee + (checkNumber * 0.06);
			System.out.println("Total Fee is $" + totalFee);
		} else if (60 <= checkNumber) {
			totalFee = baseFee + (checkNumber * 0.04);
			System.out.println("Total Fee is $" + totalFee);
		} else {
			System.out.println("Invalid Check Number ");
		}

	}

}
