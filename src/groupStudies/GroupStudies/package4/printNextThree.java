package groupStudies.GroupStudies.package4;

import java.util.Scanner;

public class printNextThree {

	public static void main(String[] args) {

		/*
		 * Ask user to enter a positive number. Print the next three numbers. First
		 * write code and get the answer, then create a printNext() method and put all
		 * your code inside...
		 */
		printNextThree();

	}

//creating method
	private static void printNextThree() {

		Scanner input = new Scanner(System.in);

		// create an int variable to use both inside and outside the loop
		int number;

		// ask user to enter a positive number
		// we want to ask until user enters a positive number SO do-while loop
		do {
			System.out.println("Enter a positive number:");
			number = input.nextInt();

		} while (number <= 0); // condition to continue asking user to enter a positive value

		// print out the next three numbers
		System.out.println("Next three numbers are:\n" + (number) + " " + (++number) + " " + (++number));

		// close the object
		input.close();

	}
}
