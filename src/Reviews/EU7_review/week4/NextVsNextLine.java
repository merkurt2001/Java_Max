package Reviews.EU7_review.week4;

import java.util.*;


public class NextVsNextLine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first Name");
		
		String firstName = input.next();
		
		System.out.println("Enter your Last Name");
		String lastName = input.next();
		
		System.out.println("Enter your age");
		short age = input.nextShort();
		
		input.nextLine();  // extra for accepting that ENTER button from previous step
		
		System.out.println("Enter your addres");
		String address = input.nextLine();
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(address);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
