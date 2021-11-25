package assignment.assignment10_mix;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter word:");
	    String word = scan.next();
	    System.out.print("Enter seperator:");
	    String separator = scan.next();
	    System.out.print("Enter count:");
	    int count = scan.nextInt();
	    
	    String result = "";
			
		for (int i = 1; i <= count; i++) {
			result = result + word + separator;
		}

		result = result.substring(0, result.length() - separator.length());
		System.out.println(result);

	}

}
