package assignment.assignment9_mix;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter word1");
	    String word1 = scan.next();
	    System.out.println("enter word2");
	    String word2 = scan.next();
	    

	    String merge = "";
	    
		if (!(word1.length() == 3) || !(word2.length() == 3)) {
			System.out.println("cannot merge");
		}else{
			for(int i=0;i<word1.length();i++) {
				merge += " " + word1.charAt(i) + word2.charAt(i);
			}
		}
			
		System.out.println(merge.replace(" ", ""));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
