package assignment.assignment9_mix;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter word:");
	    String word = scan.next();
	    
	    String dummy = "";
		    
		if(word.length()<5) {
		    System.out.println("Too short!");
		}else if(word.length()>5) {
		    System.out.println("Too long!");
		}else{
		    for(int i=4; i>=0;i--) {
		    		dummy = dummy+ word.charAt(i);
		    }
		    System.out.println(dummy);
		}
		
	}
}
