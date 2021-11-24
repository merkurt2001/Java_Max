package Reviews.EU6_review.week7;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		double numberOne = 10;
		double numberTwo = 300;
		
		double total = 2000;
		
		do {
			total += numberOne + numberTwo;
		} while(total < 1000);
		
		System.out.println(total);
		
	}

}
