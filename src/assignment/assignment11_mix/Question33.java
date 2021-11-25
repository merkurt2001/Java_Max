package assignment.assignment11_mix;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter your array words:");
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

	    String firstAndLast = "";
		for (int i = 0; i < words.length; i++) {
			firstAndLast = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
			System.out.println(firstAndLast);
		}

	}

}
