package assignment.assignment13_mix;

import java.util.ArrayList;
import java.util.Arrays;

public class Question76 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,5,3,7));
		
		System.out.println(twoTimes(al));
			

	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr){
		
		ArrayList<Integer> result= new ArrayList<Integer>();
		
		for(Integer n : arr) {
			result.add(n);
			result.add(n);
		}
		
		return result;
	}

}
