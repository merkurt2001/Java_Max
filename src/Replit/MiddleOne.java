import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		// YOUR CODE HERE
		if (str.length() > 1 && str.length() % 2 == 1) {

			str = str.substring((str.length() - 1) / 2, (str.length() + 1) / 2);

		} else if (str.length() == 1) {

			str = str + str + str;

		} else if (str.length() >= 4 && str.length() % 2 == 0) {

			str = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);

		} else if (str.length() == 2) {

			str = str + str;

		}

		System.out.println(str);

	}

}