package assignment.assignment12_mix;

import java.util.Arrays;

public class Question59 {

	public static void main(String[] args) {
		
		int[] a={1,2,3};
		int[] b={4,5,6};
		System.out.println(Arrays.toString(mergR(a,b)));

	}
	
	public static int[] mergR(int[] a,int[] b) {
		    
		int[] merged=new int[a.length+b.length];
		
		for(int z=0;z<a.length;z++) {
			merged[z]=a[z];
		}
				 
		int i=0;
		
		for(int z=a.length;z<merged.length;z++) {
			merged[z]=b[i++];
		}
		
		return merged;
				   
	}

}
