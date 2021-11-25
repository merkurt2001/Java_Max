package assignment.assignment9_mix;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the email:");
	    String email = scan.next();
	    
	    if (!(email.contains("_"))) {
			System.out.println(email);
		}else{
			int underscore = email.indexOf("_");
			int at = email.indexOf("@");
			
			String firstName = email.substring(0, underscore);
			String lastName = email.substring(underscore + 1, at);

			String output = lastName + "_" + firstName + "@gmail.com";

			System.out.println(output);

		}

	}

}
