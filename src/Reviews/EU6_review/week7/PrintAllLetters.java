package Reviews.EU6_review.week7;

public class PrintAllLetters {
	public static void main(String[] args) {
		
		// Print all the letters from A to Z
		
		for(int i = 65; i <= 90; i++) {  // i = 'A'; i < 'Z'
			System.out.print((char)i);
		}
		
		// Print all the letters from z to a
		System.out.println();
		
		for(int i = 'z'; i >= 'a'; i--) {
			System.out.print((char)i);
		}
		
	}

}
