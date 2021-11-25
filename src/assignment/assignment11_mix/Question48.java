package assignment.assignment11_mix;

import java.util.Arrays;
import java.util.Scanner;

public class Question48 {

	public static void main(String[] args) {
		
	   
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter your number:");
	    
	    int decimal = input.nextInt();

	    int[] binary = new int[8];

	    for (int i = binary.length-1; i >=0 ; i--) {

		    
		    	if (decimal>0) {
		    	
		    		binary[i]= decimal%2;
		    		decimal = decimal/2;	
		    	}
		} 
		    
		System.out.println(Arrays.toString(binary));

	}

}
