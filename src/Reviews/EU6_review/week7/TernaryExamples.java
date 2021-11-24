package Reviews.EU6_review.week7;

public class TernaryExamples {
	
	public static void main(String[] args) {
		
		String res = 10 % 2 == 0 ? "Even" : "Odd";
		System.out.println(res);
		
		int max = 20 > 100 ? 20 : 200;
		
		int numOne = 40;
		int numTwo = 40;
		int numThree = 100;
		
		System.out.println(numOne + numTwo + numThree == 180 ? "Valid Triangle" : "Invalid Triangle");
		
	}

}
