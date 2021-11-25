package assignment.assignment5_selectionStatements;

public class Question1 {

	public static void main(String[] args) {
		
		int numberOfBedrooms = 2, startingPrice = 0;

		if (numberOfBedrooms == 1) {
			System.out.println("One Bedroom Selected");
			startingPrice = 1100;
		} else if (numberOfBedrooms == 2) {
			System.out.println("Two Bedrooms Selected");
			startingPrice = 1850;
		} else if (numberOfBedrooms == 3) {
			System.out.println("Three Bedrooms Selected");
			startingPrice = 2550;
		} else {
			System.out.println("No such Bedrooms available");
		}
		
		System.out.println("Starting Price : " + startingPrice);

	}

}
