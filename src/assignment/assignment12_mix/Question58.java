package assignment.assignment12_mix;

import java.util.Arrays;

public class Question58 {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{5,33,9}};
	    int largest = arr[0][0];

		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				if (arr[i][j] > largest) {
					largest = arr[i][j];
				}
			}
		}

		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				arr[i][j] = largest;
			}
		}
			
		System.out.println(Arrays.deepToString(arr));

	}

}
