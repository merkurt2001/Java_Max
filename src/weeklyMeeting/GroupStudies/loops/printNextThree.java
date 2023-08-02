package weeklyMeeting.GroupStudies.loops;

import java.util.Scanner;

public class printNextThree {

	public static void main(String[] args) {

		/*
		 * Ask user to enter a positive number. Print the next three numbers. Please create a method named
		 * printNextThree()
		 * input = 10
		 * output = 11, 12, 13
		 * input = -1
		 * output =  Please enter a positive number
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
