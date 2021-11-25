package assignment.assignment8;

public class Question12 {

	public static void main(String[] args) {
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(false, false));

	}

	public static boolean hamletQuote(boolean a, boolean b) {
		if (a == false && b == false) {
			return false;
		} else {
			return true;
		}

	}

}
