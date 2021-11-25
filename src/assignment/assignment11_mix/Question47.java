package assignment.assignment11_mix;

import java.util.Arrays;

public class Question47 {

	public static void main(String[] args) {
		
		int[] inhabitants = {3,6,0,4,3,2,7,1};
		
		int day=0;

	  	label: for (int i = 0; i < inhabitants.length; i++) {
	  		
	  		// it is printing everyday report
	  		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

	  		// the report should be stop when all element in Array is 0;
	  		// if sum of all element is 0 it means , all people is dead because of zombie
	  		// so if sum is 0 ,it should break outer for loop and stop
	  		if (sum(inhabitants) == 0) {
	  			break label;
	  		}

	  		for (int j = 0; j < inhabitants.length; j++) {
	  			// After each day, every city will lose half of its population.
	  			inhabitants[j] = inhabitants[j] / 2;
	  		}

	  		day++;

	  		}

	  		System.out.println("---- EXTINCT ----");

	}


	public static int sum(int[] inhabitants) {
	  	
		int sum = 0;
	  	for (int i = 0; i < inhabitants.length; i++) {
	  		sum = sum + inhabitants[i];
	  	}
	  	
	  	return sum;
	  	
	}
	  	

	

}
