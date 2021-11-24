import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		// YOUR CODE HERE
		if (word1.length() != 3 || word2.length() != 3) {

			System.out.println("cannot merge");

		} else {

			for (int i = 0; i < word1.length(); i++) {

				char c = word1.charAt(i);

				char d = word2.charAt(i);

				System.out.print(c);

				System.out.print(d);

			}

		}

	}

}
