package assignment.assignment8_methods;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Input:");
	    int num = scan.nextInt();
	    isPalindrome(num);
	
	}
	
	  public static void isPalindrome(int num){
		    int palindrome = num;
		    int reverse =0;
		    
		    //compute the reverse
		    while(palindrome != 0){
		      int remainder = palindrome % 10;
		      reverse = reverse * 10 + remainder;
		      palindrome = palindrome / 10;
		    }
		    
		    //The Integer is palindrome if integer and reverse are equal
		    if(num==reverse){
		      	System.out.println(true);
		    }else{
		      	System.out.println(false);

		    }
		
	  }

}
