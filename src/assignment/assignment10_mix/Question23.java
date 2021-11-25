package assignment.assignment10_mix;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your word:");
	    String str = scan.next();
	    String between = "";

		int lastBread = 0;
		int firstBreadEnd= 0;

		for (int i = 0; i < str.length() - 4; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				lastBread = i;    
			}
		}

		for (int j = str.length(); j >= 5; j--) {
			if (str.substring(j - 5, j).equals("bread")) {
				firstBreadEnd= j;    
			}
		}

			
		if (lastBread>= 5) {  
			between = str.substring(firstBreadEnd,lastBread);
		}else{  
			between = "nothing";
		}
		
		System.out.println(between);
		
		

	}

}
