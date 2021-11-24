package Reviews.EU6_review.week10;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "python";
		
		char[] ch1= str1.toCharArray();
		char[] ch2= str2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		boolean isAnagram = Arrays.equals(ch1, ch2);
		
		System.out.println(isAnagram);
		
		
	}

}
