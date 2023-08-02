package weeklyMeeting.GroupStudies.Arrays;

public class flagUsageWithArray {

	public static void main(String[] args) {


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