package assignment.assignment9_mix;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your word:");
	    String word = scan.next();
	   
	    if (word.length() % 2 != 0 && word.length() >= 5) {
			int midOdd = (word.length() + 1) / 2;
			System.out.println(word.substring(midOdd - 2, midOdd + 1));
		}else{
			System.out.println("invalid");
		}

	}

}
