public class MergeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mergeStrings("balattt", "gete"));
	}

	public static String mergeStrings(String one, String two) {
		int shortOne;
		String longOne = "";
		String result = "";
		if (one.length() >= two.length()) {
			shortOne = two.length();
			longOne = one;
		} else {
			shortOne = one.length();
			longOne = two;
		}

		for (int i = 0; i < shortOne; i++) {

			result += "" + one.charAt(i) + two.charAt(i);

		}
		result += longOne.substring(shortOne);

		return result;
	}

}
