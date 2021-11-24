import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String[] words = new String[size];
		for (int i = 0; i < size; i++) {
			words[i] = scan.next();
		}
		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (isEqual(words, words[i]) == 1) {
				System.out.println(words[i]);
			}

		}

	}

	public static int isEqual(String[] words, String words1) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(words1) ) {
				count++;
			}
		}
		return count;
	}

}
