package Reviews.EU5_review.week5;

public class FrequencyOfString {

	public static void main(String[] args) {
		String str = "aaabbcccc";

		String nonDup = removeDuplicates(str); // abc

		String result = ""; // a3b2c4

		for (int i = 0; i < nonDup.length(); i++) { // used for iterating the characters of nonDup
			int count = frequency(str, nonDup.charAt(i)); // getting the frequency of each character
			result += nonDup.charAt(i) + "" + count;
		}

		System.out.println(result);
		
		System.out.println("-------------------------------------------");
		
		String str2 = "bbbbbbbcccccccccdeeeefggggggggggg";
		System.out.println(frequencyOfChars(str2));
		
		

	}

	// removes the duplicates from string
	public static String removeDuplicates(String str) {

		String result = ""; // ab

		for (int i = 0; i < str.length(); i++) {
			if (!result.contains("" + str.charAt(i))) {
				result += str.charAt(i);
			}
		}

		return result;
	}

	// returns the frequency of ch from str. frequency(String, char) ("aaa", 'a') ==> 3
	public static int frequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	// returns the frequency of the characters from the string
	public static String frequencyOfChars(String str) {
		String nonDup = removeDuplicates(str); // abc

		String result = ""; // a3b2c4

		for (int i = 0; i < nonDup.length(); i++) { // used for iterating the characters of nonDup
			int count = frequency(str, nonDup.charAt(i)); // getting the frequency of each character
			result += nonDup.charAt(i) + "" + count;
		}
		return result;
	}

}
