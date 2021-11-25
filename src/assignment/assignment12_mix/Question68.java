package assignment.assignment12_mix;

import java.util.Arrays;

public class Question68 {

	public static void main(String[] args) {
		
		int[] arr1 = {3,4,5};
		int[] arr2 = {1,2,6};
		
		System.out.println(Arrays.toString(addElements(arr1, arr2)));
		
	}
	
	  public static int[] addElements(int[] ints1, int[] ints2) {
		    
		   int[] newArray=new int[ints1.length];
				    
		   for(int i=0; i<ints1.length;i++) {
				    	
				newArray[i]=(ints1[i]+ints2[i]);
		   
		   }
				  
		   return newArray;    
		    
	}

}
