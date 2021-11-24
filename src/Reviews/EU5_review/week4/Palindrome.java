package Reviews.EU5_review.week4;

import Reviews.EU5_review.utilities.StringUtility;

public class Palindrome {
	
	public static void main(String[] args) {
		
		//"Anna"  ==> "annA"
		//"Level" ==> "leveL"
		
		String word = "Anna";
		boolean isPalindrome =  StringUtility.reverse(word).equalsIgnoreCase(word);
		
		System.out.println(isPalindrome);
		
		
		System.out.println("----------------------------------");
		
		System.out.println( StringUtility.isPalindrome("Muhtar") );
		
		
	}

}

/*
	str = "racecar";  ==> racecar
	
	output:
		true
		
	str = "Java";   ==> avaJ
	
	output:
		false

*/