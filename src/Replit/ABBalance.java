public class ABBalance {

	public static void main(String[] args) {
		System.out.println(isBalanced("abcab"));
		System.out.println(isBalanced("bacdf"));
		System.out.println(isBalanced("ayeba"));
		System.out.println(isBalanced("aaxxb"));

	}

	public static String isBalanced(String s) {

		for (int i = 0; i < s.length(); i++) { // i <= str.length() -1

			if (s.charAt(i) == 'a') {

				if (!s.substring(i).contains("b")) {
					return "not balanced";
				}

			}

		}

		return "balanced";

	}

}