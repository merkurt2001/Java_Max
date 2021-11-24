package groupStudies.EU6_Groups.package2;

public class Oca {

	public static void main(String[] args) {

		System.out.println(isPalindrome("no lemon, no melon"));
		System.out.println(isPalindrome("Was it a cat I saw"));
		System.out.println(isPalindrome("Step on no steps"));
		System.out.println(isPalindrome("civic"));
	}

	public static boolean isPalindrome(String str) {
		str = str.replace(" ", "").replace(",", "");

		String rts = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rts = rts + str.charAt(i);
		}

		return str.equalsIgnoreCase(rts);

	}
}