package groupStudies.EU6_Groups.package5;

public class IndexFinder {

	public static void main(String[] args) {

		/*
		 * Given an array of integers, write a function to return the index of an item
		 * in the array, where the sum of all items on its left is equal to the sum of
		 * the ones on the right. For example : Given [4, 9, 1, 3, 6, 4] your function
		 * should return 2 because the item at index 2 is 1, and 4+9 =3+6+4
		 */
		char[] letter = { 'a', 'b', 'h', 'e', 'l', 'l', 'o', ' ', 's', 'b', 'w', 'o', 'r', 'l', 'd', 's', 'b', '!' };
		System.out.println(getBetween(letter, 'b', 's'));
	}

	public static String getBetween(char[] letter, char ch1, char ch2) {
		String result = "";
		boolean flag = false;

		for (int i = 0; i < letter.length; i++) {

			if (letter[i] == ch1) {
				flag = true;
			} else if (letter[i] == ch2) {
				flag = false;
			} else if (flag) {
				result = result + letter[i];
			}

		}

		return result;

	}

}