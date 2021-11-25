package assignment.assignment4_selectionStatements;

public class Question14 {

	public static void main(String[] args) {
		
		
		int numberOfBooks = 15;
		int awardedPoints = 0;

		if (numberOfBooks == 1) {
			awardedPoints += 5;
		} else if (numberOfBooks == 2) {
			awardedPoints += 15;
		} else if (numberOfBooks == 3) {
			awardedPoints += 30;
		} else if (4 <= numberOfBooks) {
			awardedPoints += 60;
		}

		System.out.println("The number of Points Awarded is " + awardedPoints);

	}

}
