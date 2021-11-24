public class MethodsUnique {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("javaadava"));
	}

	public static String uniqueChars(String str) {
		String dummy = "";
		for (int i = 0; i < str.length(); i++) {
			if (!dummy.contains(str.substring(i, i + 1))) {
				dummy += str.substring(i, i + 1);
			}
		}
		return dummy;

	}

}