package assignment.assignment10_mix;

public class Question31 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Nurses Run"));
	}
	
	public static boolean isPalindrome(String check) {
		    
		check = check.toLowerCase().replace(" ", "");

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = check.length() - 1;

		// While there are characters toc compare
		while (i < j) {
			
			// If there is a mismatch
			if (check.charAt(i) != check.charAt(j)) {
				return false;
			}
			
			// Increment first pointer and
			// decrement the other
			i++;
			j--;
			
		}

		// Given string is a palindrome
		return true;
	
	}

}
