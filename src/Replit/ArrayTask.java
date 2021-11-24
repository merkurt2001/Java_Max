import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("How many number?");
		int size = inp.nextInt();
		System.out.println("enter "+size+" number");
		int[] array = new int[size];
		for (int i = 0; i <= size-1; i++) {

			array[i] = inp.nextInt();
		}

		plus_minus(array);
	}

	public static void plus_minus(int[] array) {
		int negative = 0;
		int positive = 0;
		int zeros = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				negative++;
			} else if (array[i] > 0) {
				positive++;
			} else {
				zeros++;
			}

		}
		System.out.println("positives: " + positive + ", negatives:" + negative + ", zeros:" + zeros);

	}
}