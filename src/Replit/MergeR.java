import java.util.Arrays;

public class MergeR {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };

		int[] y = { 3, 4, 1, 1, 1, 1, 1, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(mergR(x,y)));
	}

	public static int[] mergR(int[] a, int[] b) {
		int[] z = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			z[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			z[a.length + i] = b[i];
		}
		return z;
		

	}// end mergR
}
