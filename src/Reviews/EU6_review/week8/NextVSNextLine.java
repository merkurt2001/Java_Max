package Reviews.EU6_review.week8;

import java.util.Scanner;

public class NextVSNextLine {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = input.next();
		
		System.out.println("Enter your last name");
		String lastName = input.next();
		
		System.out.println("Enter your age");
		byte age = input.nextByte();
		
		input.nextLine();
		
		System.out.println("Enter your address");
		String address = input.nextLine();
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(address);
		
	}

}
