import java.util.Arrays;

public class MultiplicationTable2D {

	public static void main(String[] args) {
		int[][] multiplicationTable = new int[10][10];

		// TODO: type your code below
		for (int i = 1; i <= multiplicationTable.length; i++) {
			for (int j = 1; j <= multiplicationTable.length; j++) {
				multiplicationTable[i-1][j-1]=i*j;
			}
		}

		// Do not modify below line it will be used to test your code. And
		// Can be used by you while developing your code
		System.out.println(Arrays.deepToString(multiplicationTable));
	}
}