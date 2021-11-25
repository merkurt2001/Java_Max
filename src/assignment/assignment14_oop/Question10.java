package assignment.assignment14_oop;

public class Question10 {

	public static void main(String[] args) {
		
		System.out.println("1+1 = "+Calc.plus(1,1) );
		System.out.println("1-1 = "+Calc.minus(1,1) );		
	
	}

}

class Calc {
	
	public static int plus(int num1, int num2) {		
		return num1+num2;
	}
		
	public static int minus(int num1, int num2) {
		return num1-num2;
	}

}