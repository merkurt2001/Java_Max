package Reviews.EU6_review.week5;

/*
 * 		Given a letter (char) we want to find out if its uppercase, lowercase, or not a letter 
 */

public class CharacterChecker {
	
	public static void main(String[] args) {
		
		char letter = 'E';
		
		if(letter >= 65 && letter <= 90) {
			System.out.println(letter + " is uppercase");
		} else if(letter >= 97 && letter <= 122) {
			System.out.println(letter + " is lowercase");
		} else {
			System.out.println(letter + " is not a letter");
		}
		
	
		// Same task, different approach
		
		if(letter >= 'A' && letter <= 'Z') {
			System.out.println(letter + " is uppercase");
		} else if(letter >= 'a' && letter <= 'z') {
			System.out.println(letter + " is lowercase");
		} else {
			System.out.println(letter + " is not a letter");
		}
		
//		if () {
//			
//		} else if() {
//			
//		} else if() {
//			
//		}
		
		
	}

}
