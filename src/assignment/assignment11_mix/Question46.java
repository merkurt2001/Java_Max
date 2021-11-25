package assignment.assignment11_mix;

import java.util.Arrays;

public class Question46 {

	public static void main(String[] args) {
		
		String str = "olive,fish,pursuit,old,warning,python,java,cat,ray";
		String[] arr = str.split(",");
	    
		Arrays.sort(arr);
	    String word = arr[0];
	    String word2="";
	    
	    for (int i = 0; i < arr.length-1; i++) {
	    	if (arr[i].length() <= word.length()) {
	    		if(arr[i].length() > arr[i+1].length()) {
	    			continue;
	            }
	            word = arr[i];
	            word2+=word + ", ";
	        }
	    }
	    
	    String arr2[] = word2.split(", ");
	        
	    System.out.println(Arrays.toString(arr2));
		
		

	}

}
