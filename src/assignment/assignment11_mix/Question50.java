package assignment.assignment11_mix;

import java.util.Arrays;
import java.util.Scanner;

public class Question50 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter size:");
	    int size = scan.nextInt();
	    
	    int[] nums = new int[size];
		for(int i =0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		
		int[] numsNew = new int[2 * size];
		numsNew[numsNew.length - 1] = nums[nums.length - 1];

		System.out.println(Arrays.toString(numsNew));

	}

}
