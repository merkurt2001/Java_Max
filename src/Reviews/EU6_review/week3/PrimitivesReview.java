package Reviews.EU6_review.week3;

public class PrimitivesReview {
	
	public static void main(String[] args) {
		
		byte byteNumber = 40;
		System.out.println("Byte value: " + byteNumber);
		
		short shortNumber; // declared a variable b2, but no value
		shortNumber = 200;
		System.out.println("Short value: " + shortNumber);
		
		int intNumberHere = 40;
		System.out.println("Int value here: " + intNumberHere);
		
		System.out.println(byteNumber + shortNumber);
		
		long longVariable = 10; // implicitly take the int and store to long
		
		long longVariable2 = 100000000000L;// 100000000000 is too big for int, so it does not compile, we need the L at the end
		
		System.out.println(132312312313213L);
		
		char letterA = 'A';
		char letterB = 66;
		
		System.out.println(letterA);
		System.out.println(letterB);
		System.out.println((int)letterB);
		System.out.println((char)67);
		
		boolean isValid = true;
		
		
		
	}

}
