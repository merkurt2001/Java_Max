package Reviews.EU6_review.week3;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		System.out.println(10 + 2);
		System.out.println("10 + 2 = " + (10 + 2));
		System.out.println("10 - 2 = " + (10 - 2));
		System.out.println("10 * 2 = " + (10 * 2));
		System.out.println("10 / 2 = " + (10 / 2));
		System.out.println("10 % 2 = " + (10 % 2));
		
		System.out.println();
		
		System.out.println("10 / 3 = " + (10 / 3)); // int/int -> int
		System.out.println("10.0 / 3 = " + (10.0 / 3)); // double/int -> double
		System.out.println("10 / 3.0 = " + (10 / 3.0)); // int / double -> double
		
		System.out.println("10 / 3.0 = " + (10 / (int)3.0)); // int / int -> int
		System.out.println("10 / 3.0 = " + (int)(10 / 3.0)); // int / double -> (int) double
		System.out.println("10 / 3 = " + (double)(10 / 3)); 
		System.out.println();
		
		byte resultOne = (byte)(50 * 4);
		System.out.println(resultOne);
		
		float result;
		result = 10/3; // int/int -> int
		System.out.println(result);
		
		int resultTwo = 4 * 2 - 4 + 3 *  4;
					//  8 - 4 + 3 * 4
					//  8 - 4 + 12
					// 	4 + 12
					// 	16
		
		System.out.println(resultTwo);
		
		int resultThree = 10 % 2 + -4 / 2  * 5;
						// 0 - 4 / 2 * 5
						// 0 - 2 * 5
						// 0 - 10
						// -10

		System.out.println(resultThree);
		
		int seconds = 125;
		int hours = seconds / 3600;// -> hours // 60 * 60
		seconds = seconds % 3600;
		int minutes = seconds / 60;
		seconds = seconds % 60;
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		
		
	}

}
