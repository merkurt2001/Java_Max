package groupStudies.GroupStudies.package7;

public class flagUsage {

	public static void main(String[] args) {

		/*
		 * write a method named getBetween which except char array and returns you the
		 * letters between two different items given among your array elements
		 */

		char[] letter = { 'a', 'b', 'h', 'e', 'l', 'l', 'o', ' ', 's', 'b', 'w', 'o', 'r', 'l', 'd', 's', 'b', '!' };
//								ON---------------------------------OFF ON---------------------------OFF

		System.out.println(getBetween(letter, 'b', 's'));

	}

	public static String getBetween(char[] letter, char ch1, char ch2) {

		String result = "";
		boolean flag = false;

		for (char each : letter) {
			if (each == ch1) {
				flag = true;
			} else if (each == ch2) {
				flag = false;
			} else if (flag) {
				result += each;
			}

		}

		return result;

	}

}
