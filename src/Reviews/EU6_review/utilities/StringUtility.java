package Reviews.EU6_review.utilities;

import java.util.Arrays;

public class StringUtility {
	
	// reverses any given string
	public static String reverse(String word) {					
		String result = ""; 
		
		for(int i = word.length()-1; i >=0 ; i-- ) {
			result +=word.charAt(i);
		}
		
		return result;
	}
	
	
	//checks if the string is palindrome, returns true/false
	public static boolean isPalindrome(String str) {
		
		return reverse(str).equalsIgnoreCase(str);
	}
	
	
	// removes the duplcaites from the given string
	public static String removeDup(String str) {
									// "aabbcc"
		String result = ""; //"abc"
		
		for(String each : str.split("")) {
			if(!result.contains(each)) {
				result += each;
			}
		}
		
		return result;
	}
	
	
	// checks if two strings are anagram (silent & listen)
	public static boolean isAnagram(String str1, String str2) {
							//		"acb"        "bca"
		char[] ch1 = str1.toCharArray(); //{a, c, b}
		char[] ch2 = str2.toCharArray(); // {b, c, a}
   		
		Arrays.sort(ch1); //{a, b, c}
		Arrays.sort(ch2);// {a, b, c}
		
		return Arrays.equals(ch1, ch2);
	}

	
	//returns the frequency of the char string the string
	public static int frequency(String str, char ch) {
		//						"aaabb"     'a'
		int count = 0;
		for(char each : str.toCharArray()) { // a, a, a, b, b
			if(each == ch) {
				count++;
			}
		}
		
		return count;
	}
	
	
	//returns the unique characters from string
	public static String uniques(String str) {
								//"aabccd"
		String result = "";
		for(char each : str.toCharArray()) {
			if(frequency(str, each) == 1) {
				result += each;
			}
		}
		
		
		return result;
	}
	
	
	//"aaabbc" ==> a3b2c1
	public static String frequencyOfChars(String str) {
											// "aaabbc"
		String result = ""; //a3b2c1
		for(char each : removeDup(str).toCharArray()) { //a, b, c

			result +=  each+"" + frequency(str, each); // 3, 2,  1
		}
		
		return result;
	}
	
	
}
