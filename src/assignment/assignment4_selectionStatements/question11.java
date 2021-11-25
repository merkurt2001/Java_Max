package assignment.assignment4_selectionStatements;

public class question11 {

	public static void main(String[] args) {


		 int distance = 5000;
		 String medium = "Air";

		switch (medium) {
			case "air": case "Air":
				System.out.println("Time travel in air is " + distance / 1100 + " second");
				break;
			case "water": case "Water":
				System.out.println("Time travel in water is " + distance / 4900 + " second");
				break;
			case "steel": case "Steel":
				System.out.println("Time travel in steel is " + distance / 16400 + " second");
				break;
			default:
				System.out.println("Please check your input");

		 } System.out.println();

	}

}
