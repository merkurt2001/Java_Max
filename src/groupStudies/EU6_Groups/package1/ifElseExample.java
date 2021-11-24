package groupStudies.EU6_Groups.package1;

import java.util.Scanner;

public class ifElseExample {
	
	static Scanner sc;

	public static void main(String[] args) {
		/**
		 * [EligibleToVote]
		 * 
		 * If the citizenship is for the USA then ask user to enter their age. Use the
		 * age to figure out if they vote.
		 * 
		 * -> 18+ : You are eligible to vote -> < 18: You must be at least 18 years old
		 * to vote
		 * 
		 * If the person is not a USA citizen: You must be US citizen in order to vote"
		 */
		sc=new Scanner(System.in);
		System.out.println("Are you a USA citizen?");
		String userInput = sc.nextLine();

		if (userInput.equalsIgnoreCase("yes")) {
			
			System.out.println("How old are you?");
			int age = sc.nextInt();

			if (age >= 18) {
				System.out.println("Your age is " + age + "... Congratulations!!! You are eligible to vote :)");
			} else {
				System.out.println("Your age is " + age + "... Sorry, You must be at least 18 years old to vote");
			}
		} else {
			System.out.println("You must be a US citizen in order to vote...");
		}
	}

}
