package assignment.assignment12_mix;

import java.util.Scanner;

public class Question57 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter matrix elements:");
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		    
		for (int i = 0; i < matrix.length; i++) {
			for (int j=0; j< matrix.length; j++) {
				if (i == j) {
		    		leftDiagonal+=matrix[i][j];
		    	}
		    	if (i == matrix.length - j - 1) {
		    		rightDiagonal+= matrix[i][j];
		    	}
		    }
		}
		    
		result= leftDiagonal-rightDiagonal;
		
		System.out.println(Math.abs(result));

	}

}
