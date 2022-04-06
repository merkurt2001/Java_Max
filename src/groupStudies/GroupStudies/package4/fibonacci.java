package groupStudies.GroupStudies.package4;

import java.util.Scanner;

public class fibonacci {

	/*
	 * Write a program to print Fibonacci series of n terms where n is declared by
	 * user:
	 * 
	 * 0 1 1 2 3 5 8 13 21 34 ......
	 */

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34 ......

		// my pattern:
		// my first step as starting point to print out directly the fist number of
		// fibonacci series
		// I will design my pattern based on the next number and it will be the first
		// number in the next iteration

		// 0 (as hard coded)
		// in my loop
		// 1. iteration => 1 (0+1)
		// 2. iteration => 1 1 (1+1)
		// 3. iteration => 1 1 2 (1+2)
		// 4. iteration => 1 1 2 3 (2+3)
		// 3. iteration => 1 1 2 3 5 (3+5)

		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt(); // to get the input from user

		// take the first two numbers of Fibonacci and then assign them to variables
		int num1 = 0;
		int num2 = 1;
		String comma = ", ";

		System.out.print(num1); // print first number as hard coded

		for (int i = 1; i < count; i++) {

			System.out.print(comma + num2); // print the num2 in each iteration
			comma = ", ";
			int tempTotal = num1 + num2;

			// the preparation for the next iteration
			num1 = num2; // my num2 => num1 in the next iteration
			num2 = tempTotal; // the sum of the previous two numbers => my num2 in the next iteration

		}

		input.close();

	}

}
