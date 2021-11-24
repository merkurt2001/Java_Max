public class CleanStr {

	public static void main(String[] args) {
		System.out.println(clean ("one two three","two"));

	}

	public static String clean(String text, String badWord) {
		String result = "";
		
		result = text.replace(badWord, "");

		return result;

	}

}