package assignment.assignment4_selectionStatements;

public class Question15 {

	public static void main(String[] args) {
		

		int number = 4;

		switch (number) {
		case 0:case 1:case 2:
			System.out.println("Low Number");
			break;
		case 3:case 4:case 5:
			System.out.println("Medium Number");
			break;
		default:
			System.out.println("Other Number");
		}

	}

}
