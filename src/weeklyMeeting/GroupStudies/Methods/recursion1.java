package weeklyMeeting.GroupStudies.Methods;

public class recursion1 {

	public static void main(String[] args) {
		int x=5;

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
