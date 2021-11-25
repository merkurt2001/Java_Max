package assignment.assignment11_mix;

import java.util.Arrays;

public class Question43 {

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,44,1,100,55};
		
	    int temp = 0;
	    int length = nums.length;
	    
	    for (int i = 0; i < nums.length/2; i++) {
	    	
	    	temp = nums[i];
	    	nums[i]= nums[length-1-i];
	    	nums[length-1-i]= temp;
			
		}
    
	   System.out.println(Arrays.toString(nums));

	}

}
