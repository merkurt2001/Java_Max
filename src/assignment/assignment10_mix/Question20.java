package assignment.assignment10_mix;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n = scan.nextInt();
	    
	    long result = 1;
	    
	    for (int i = n; i > 0; i--) {
			result = result * i;
		}

		System.out.println(result);

	}

}
