package assignment.assignment9_mix;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your word:");
	    String word = scan.next();
	    
	    String first = word.substring(0, 1);
		String last = word.substring(word.length() - 1);
		
		if (first.equalsIgnoreCase("x") && !(last.equalsIgnoreCase("x"))) {
			word = word.substring(1);
		}else if (last.equalsIgnoreCase("x") && !(first.equalsIgnoreCase("x"))) {
			word = word.substring(0, word.length() - 1);
		}else if (first.equalsIgnoreCase("x") && last.equalsIgnoreCase("x")) {
			word = word.substring(1, word.length() - 1);
		}

		System.out.println(word);

	}

}
