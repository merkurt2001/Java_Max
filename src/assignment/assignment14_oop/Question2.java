package assignment.assignment14_oop;

public class Question2 {

	public static void main(String[] args) {
		
		LameCalculator lc = new LameCalculator();
		System.out.println(lc.plus(1, 1));
		System.out.println(lc.minus(1, 1));
		System.out.println(lc.multiply(2, 1));
		System.out.println(lc.divide(10, 2));

	}

}

class LameCalculator{
	
	public int plus(int a,int b) {
		return a+b;
	}
	
	public int minus(int a,int b) {
		return a-b;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}
	
	public int divide(int a,int b) {
		return a/b;
	}
}
