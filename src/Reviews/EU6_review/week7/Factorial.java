package Reviews.EU6_review.week7;

public class Factorial {
	
	public static void main(String[] args) {
		
		// !5 = 5 * 4 * 3 * 2 * 1
		
		long number = 20;
		long factorial = 1;
		
		// factorial = number-- * number-- * number-- * number-- * number--;
		
		while(number > 1) {
			factorial *= number--; // factorial = factorial * number--
		}
		
		// number = 1
		// factorial  = 120 
		
		System.out.println(factorial);
		
		
	}

}
