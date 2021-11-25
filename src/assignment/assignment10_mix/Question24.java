package assignment.assignment10_mix;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your word:");
	    String sentence = scan.nextLine();
	    
	    int countJava = 0;
		int countPython = 0;

		for (int i = 0; i < sentence.length() - 3; i++) {
			if (sentence.substring(i, i + 4).equals("java")) {
				countJava++;
			}
		}

		for (int i = 0; i < sentence.length() - 5; i++) {
			if (sentence.substring(i, i + 6).equals("python")) {
				countPython++;
			}
		}

		if (countJava == countPython) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
