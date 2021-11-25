package assignment.assignment8_methods;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		
		next3(number);

	}
	
	public static void next3(int num) {
		
		System.out.println("next 3 are");
		System.out.println((num+1)+" "+ (num+2) + " " + (num+3));
	}
	
	

}
