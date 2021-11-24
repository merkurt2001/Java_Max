import java.util.Scanner;

public class CatDog {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		System.out.println(catDog(str));
	}

	public static boolean catDog(String str) {

		int countcat = 0;
		int countdog = 0;
		if (str.length() >= 3) {

			for (int i = 0; i < str.length() - 2; i++) {

				if (str.substring(i, i + 3).equals("cat"))

					countcat = countcat + 1;

			}

			for (int j = 0; j < str.length() - 2; j++) {

				if (str.substring(j, j + 3).equals("dog"))

					countdog = countdog + 1;

			}

		}

		if (countdog == countcat) {

			return true;
		} else {

			return false;
		}

	}

}
