package assignment.lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		double numberOfCookies;
		double numberOfServings;
		double numberOfCalories;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of cookies you ate:");
		numberOfCookies=sc.nextInt();
		
		numberOfServings = (numberOfCookies/40)*10;
		numberOfCalories = numberOfServings*300;
		
		System.out.println((int)numberOfCookies + " cookies equal to " + numberOfCalories + " calories");

	}

}
