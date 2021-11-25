package assignment.assignment12_mix;

import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {
		
	    int[][] arr = { {2,2,1,3,4,5} ,{5,2,3,3,4,5}, {3,2,3,1,4,5} };
	    int matches = 0;
		    
	    for (int i = 0; i <= arr.length - 1; i++) {
		    for (int j = 0; j <= arr[i].length - 2; j++) {
		    	if (arr[i][j] == arr[i][j + 1]) {
		    		matches++;
		    	}
		    }
	    }
			
		System.out.print("matches: "+matches);

	}

}
