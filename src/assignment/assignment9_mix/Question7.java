package assignment.assignment9_mix;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your word:");
	    String word = scan.next();
	    
		    
	    int num = word.length()/2;
		String newWord=word.substring(0,num).concat(word.substring(0,num));
		    
		System.out.println(newWord);

	}

}
