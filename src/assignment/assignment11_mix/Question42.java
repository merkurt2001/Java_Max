package assignment.assignment11_mix;

import java.util.Arrays;

public class Question42 {

	public static void main(String[] args) {
		
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	public static String[] getWithE(String[] arr) {
	    
		int elementE = 0; // to count how many element has "e"
		  
		// write a loop to check "e" and count
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				elementE++;
			}
		}

		// decide fewValues array size from elementE and create new array
		String[] fewValues = new String[elementE];

		int j = 0; // this will be index of fewValues array

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				fewValues[j++] = arr[i]; // when it has "e" it will assigned to fewVaules array
			}
		}
			  
		return fewValues;

	}

}
