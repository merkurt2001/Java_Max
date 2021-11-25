package assignment.assignment8_methods;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		plus();

	}
	
	public static void plus() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter firt number:");
		int number1 = sc.nextInt();
		
		System.out.print("Enter second number:");
		int number2 = sc.nextInt();
		
		System.out.println("Result:"+ (number1+number2));
		
	}

}
