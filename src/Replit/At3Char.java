public class At3Char {

	public static void main(String[] args) {
		System.out.println(at3("longword","foo"));

	}

	public static String at3(String target, String word) {
		return target.substring(0, 3).concat(word).concat(target.substring(3));

	}
}