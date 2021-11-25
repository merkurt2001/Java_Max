package assignment.assignment11_mix;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		
	    
	    int[] nums = {1,5,5,1,1};
	    
	    boolean flag = false;
		
	    for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				flag = true;
			}

		}
		
	    System.out.println(flag);

	}

}
