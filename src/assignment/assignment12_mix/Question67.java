package assignment.assignment12_mix;

import java.util.ArrayList;
import java.util.Arrays;

public class Question67 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,2,3,4,0));
		
		timesTwo(al);
	
	}
	
	public  static void timesTwo(ArrayList<Integer> nums) {
		
		for (int i = 0; i < nums.size(); i++) {
			
			nums.set(i,nums.get(i)*2);
			
		}
		
		System.out.println(nums);
		
	}

}
