package assignment.assignment12_mix;

import java.util.Arrays;
import java.util.Scanner;

public class Question56 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter size:");
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	   
	    int temp = nums[0];
		
	    for (int i = 1; i < size; i++) {
			nums[i - 1] = nums[i];
		}
		
	    nums[size - 1] = temp;
		
	    System.out.println(Arrays.toString(nums));

	}

}
