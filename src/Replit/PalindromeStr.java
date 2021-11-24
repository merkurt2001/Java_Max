public class PalindromeStr {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Noon"));
	}

	public static boolean isPalindrome(String check) {
		String reverse="";
		check=check.trim().replace(" ", "");
		for (int i = check.length()-1; i >=0; i--) {
			reverse+=check.charAt(i);
		}
		if(check.equalsIgnoreCase(reverse)) {
			return true;
		}else {
			return false;
		}

	}
}