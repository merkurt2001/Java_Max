package Reviews.EU7_review.week6;

import java.util.Arrays;

public class A09_AddElementToArray {

	public static void main(String[] args) {
		
		String [] students = { "Erdem", "Yasin", "Recep", "Hande" , "Selena" };
		
		students = addElement(students, "Ibrahim");
		
		students = addElement(students, "Samra");
		
		System.out.println(Arrays.toString(students));
	}
	
	public static String[] addElement(String[] arr, String element) {
		String[] newArray = new String[arr.length+1]; // created a new array with size one added
		
		int i = 0;
		for(String each : arr) {
			newArray[i++] = each;
		}
		
		newArray[i] = element;
		
		return newArray;
	}
	
}
