package groupStudies.EU7_Groups.Methods;

public class recursion1 {

	public static void main(String[] args) {
		int x=5;
		int factor=1;
		for (int i = x; i >= 1; i--) {
			factor= factor * i;
		}
		System.out.println("Factorial of = " + factor);
		System.out.println("Factorial of = " + factorial(x));
	}

	public static int factorial(int num) {

		if (num >= 1) {
			return num * factorial(num - 1);
		} else {
			return 1;
		}

	}

}
