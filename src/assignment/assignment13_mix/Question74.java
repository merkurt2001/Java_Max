package assignment.assignment13_mix;

import java.util.ArrayList;
import java.util.Arrays;

public class Question74 {

	  public static void main(String[] args){
		  
		  ArrayList<Integer>  arr = new ArrayList<>();
		  Integer[] nums = new Integer[]{3,4,3,3};
		  arr.addAll(Arrays.asList(nums));
		  
		  System.out.print(removeInst(arr,4));
	  }
	  
	  public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){
		    
		    for (int i=r.size()-1;i>=0;i--){
		    	if (r.get(i)==n) {
		    		r.remove(i);
				}
		     }
		    
		    return r;
		    
	  }

}
