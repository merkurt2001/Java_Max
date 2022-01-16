package groupStudies.EU7_Groups.Methods;

public class recursion {

	public static void main(String[] args) {

		printNumber(10);

	}

	public static void printNumber(int n) {
		
		if (n<=0) {
			System.err.println("end of story");
			return;
		}
		
		System.out.println(n);
		printNumber(n-1);
	}

}
