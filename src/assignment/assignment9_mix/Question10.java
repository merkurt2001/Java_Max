package assignment.assignment9_mix;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the email:");
	    String email = scan.next();
	    
	    int underscore = email.indexOf("_");
		int at = email.indexOf("@");
		int dot=email.indexOf(".");

		String firstName = email.substring(0, underscore);
		String lastName = email.substring(underscore + 1, at);
			
		String domain=email.substring(at+1,dot);
		String topDomain=email.substring(dot+1);
			
		firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
		lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
			
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
			
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topDomain);

	}

}
