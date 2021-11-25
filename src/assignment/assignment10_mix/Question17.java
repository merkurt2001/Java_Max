package assignment.assignment10_mix;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter start letter:");
	    char start = scan.next().charAt(0);
	    System.out.print("Enter end letter letter:");
	    char end = scan.next().charAt(0);
	    
	    for (int ctr = 1; start <= end; start++) {
	    	System.out.print(start);
	    }

	}

}
