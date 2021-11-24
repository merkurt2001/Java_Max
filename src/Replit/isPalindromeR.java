public class isPalindromeR {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("abba"));
	}
	public static boolean isPalindrome(String str) {

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}

		}

		return true;
	}

}
