package Replit;

public class AnagramR {

	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "cab"));
		System.out.println(isAnagram("aaaaaa", "cab"));
		System.out.println(isAnagram("listen", "silent"));

	}

	public static boolean isAnagram(String one, String two) {

		if (one.length() != two.length()) {
			return false;
		}

		for (int i = 0; i < one.length(); i++) {
			two = two.replaceFirst("" + one.charAt(i), "");
		}

		return two.isEmpty();

	}

}