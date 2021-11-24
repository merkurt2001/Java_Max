import java.util.Scanner;

public class DiagonalDif2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int d1=0;
		int d2=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i==j) {
					d1+=matrix[i][j];
				}
				if (i==matrix.length-j-1) {
					d2+=matrix[i][j];
				}
			}
		}

		// FINAL PRINT
		int result = d1-d2;
		System.out.println(Math.abs(result));
	}
}