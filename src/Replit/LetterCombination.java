public class LetterCombination {

	public static void main(String[] args) {
		char[] letters = { 'z', 'y', 'x', 'w', 'v' };
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(letters[i]);
				System.out.println(letters[j]);
			}
		}
	}
}