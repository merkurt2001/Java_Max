import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber2D {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below
		int maxValue = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] > maxValue) {
                    maxValue = arr[j][i];
                }
            }
        }
		for (int[] val : arr) {
			Arrays.fill(val, maxValue);
		}
        
		System.out.println(Arrays.deepToString(arr));
	}  
}