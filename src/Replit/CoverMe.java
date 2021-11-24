public class CoverMe {

	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me"));

	}

	public static String coverString(String main, String coverME) {
		String result = "";
		if (!main.contains(coverME)) {
			result = "[" + main + "]";
		} else {
			result = main.replace(coverME, "[" + coverME + "]");
		}

		return result;

	}

}