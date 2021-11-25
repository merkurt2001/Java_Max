package assignment.assignment10_mix;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter word:");
	    String word = scan.next();
	    
	    if (word.length() >= 4) {
	    	if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
				exists = true;
			}else{
				exists = false;
			}
	    	System.out.println(exists);
		}else{
			System.out.println(exists);
		}

	}

}
