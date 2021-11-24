package Reviews.EU6_review.week8;

import java.util.Scanner;


public class MinAndMax {
	
	/*
	 * 
	 * Write a program that will ask the user to enter 5 numbers
	 * 
	 * What is the min number from all of the inputs
	 * 
	 * What is the max number from all of the inputs
	 *
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int min = 2147483647;
		int max = -2147483647;
		
		int run = 1;
		
		do {
			System.out.println("Enter a number");
			
			int number = in.nextInt();
		
			if(number < min) {
				min = number;
			}
			
			if(number > max) {
				max = number;
			}
			
		}while(run++ < 5);
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}

}
