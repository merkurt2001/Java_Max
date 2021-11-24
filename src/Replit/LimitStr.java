public class LimitStr {

	public static void main(String[] args) {
		System.out.println(limit("abcd", 2));
	}

	public static String limit(String text, int maxLength) {
		return text.substring(0, maxLength);

	}
}