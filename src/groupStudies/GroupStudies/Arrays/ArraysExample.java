package groupStudies.GroupStudies.Arrays;


public class ArraysExample {

	public static void main(String[] args) {
		int[] a = { 1, 7, 5, 6, 4, 14, 11 };
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				a[i + 1] = a[i + 1] * 2;
			}
		}
		for (int i = 0; i < a.length - 1; i++)
			System.out.println(a[i]);
	}

}
