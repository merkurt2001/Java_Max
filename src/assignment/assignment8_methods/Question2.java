package assignment.assignment8_methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		
		cube(number);

	}
	
	public static void cube(int number) {
		
		System.out.println("Output is:" + (number*number*number));
	}

}
