package assignment.assignment11_mix;

import java.util.Arrays;

public class Question37 {

	public static void main(String[] args) {
		
		String[] arr = {"hello", "why", "by", "apple" , "note"};
		
		String newArr[] = new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			String word = "";
			
			word = word + arr[i].charAt(0) + arr[i].charAt(arr[i].length()-1);
			
			newArr[i] = word;
		
		}
		
		System.out.println(Arrays.toString(newArr));

	}

}
