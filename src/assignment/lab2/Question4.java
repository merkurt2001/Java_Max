package assignment.lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		 

		System.out.println("Please enter the number of males registered in a class");

		 

		int male = scan.nextInt();

		 

		System.out.println("Please enter the number of females registered in a class");

		 

		int female = scan.nextInt();

		 

		int sum = (male + female);

		 

		double ratioM = (100*male) / sum;

		double ratioF = (100*female) / sum;

		 

		System.out.println("The percentage of males is " + ratioM);

		System.out.println("The percentage of males is " + ratioF);

	}

}
