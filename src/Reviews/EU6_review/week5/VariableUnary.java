package Reviews.EU6_review.week5;

public class VariableUnary {
	

	public static void main(String [] args) {
		int a = 5; // 6
		int b = a++ + a-- + a * 2 + a + ++a;
		//		5  +  6   + 5 * 2 + 5 +  6
		//      5  +  6   + 10 + 5 +  6
		//      11   + 10 + 5 +  6
		//      21 + 5 +  6
		// 			26 + 6
		// 			32
		System.out.println(a);
		System.out.println(b);
		
		
		// ------------------------
		
		
		int x = 200; // 199
		int y = -x++ + --x  * x-- % 2 + x;
		//     -200  + 200 * 200 % 2 + 199
		//	   -200  + 40000 % 2 + 199
		//		-200  + 0 + 199
		//		-200  + 199
		//      -1
		
		System.out.println(x);
		System.out.println(y);
		
		
		// ------------------------
		// LOGICAL
		
		int one = 50;
		int two = 0;
		
		System.out.println(one > two);
		System.out.println(one > two || one/two == 0);
		//System.out.println(one > two | one/two == 0); // causes exception - error
		
		
	}

}
