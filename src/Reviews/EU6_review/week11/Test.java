package Reviews.EU6_review.week11;

import java.util.Arrays;

import Reviews.EU6_review.utilities.ArraysUtility;
import Reviews.EU6_review.utilities.StringUtility;

public class Test {
	
	public static void main(String[] args) {
		String name = "Madam";
		
		String reversedName = StringUtility.reverse(name);
		
		System.out.println(reversedName);
		
		boolean r1 = StringUtility.isPalindrome(name);
		
		System.out.println(r1);
		
		String str1 = "aaaaabbbbbbcccccdddddeeeeeeeaaaaaaa";
		
		String str2 = StringUtility.removeDup(str1);
		
		System.out.println(str2);
		
		boolean r2 = StringUtility.isAnagram("heart", "earth");
		System.out.println(r2);
		
		
		String str3 = "aaaaabccccccd";
		String unique =  StringUtility.uniques(str3);
		
		System.out.println(unique);
		
		System.out.println( StringUtility.frequencyOfChars("aaaaabbbbbbcccccddddd"));
		
		System.out.println("---------------------------------------------");
		
		int[] arr = {1,100, 200, 300, 4,5,6,7,8,10};
		double[] arr2 = {1.5, 2.5, 5.5, 0, -1 };
		
		int max = ArraysUtility.max(arr);
		double max2 = ArraysUtility.max(arr2);
		
		System.out.println(max);
		System.out.println(max2);
		
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {7,8,9,10,11,12,13,14};
		int[] a3 = ArraysUtility.merge(a1, a2);
		
		System.out.println(Arrays.toString(a3));
		
		
		String[] s1 = {"A", "B", "C"};
		String[] s2 = {"D", "E", "F", "H", "I"};
		String[] s3 = ArraysUtility.merge(s1, s2);
		
		System.out.println(Arrays.toString(s3));
		
		
		
		
		
		
		
		
		
	}
	

}
