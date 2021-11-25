package assignment.assignment10_mix;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter word:");
	    String str = scan.next();
	    System.out.print("Enter n:");
	    int n = scan.nextInt();
	    
	    String check = str.substring(0, n);
		int count = 0;
			
		for (int i = 0; i < str.length() - (n - 1); i++) {
			if (str.substring(i, i + n).equals(check)) {
				count++;
			}
		}

		if (count > 1) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
