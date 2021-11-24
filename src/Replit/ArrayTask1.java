import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();

		}
		// #2 Your code here
		isPos(arr);
	}

	public static void isPos(int[] arr) {
		// #1 your code here
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println("positive");
			} else {
				System.out.println("not positive");
			}
		}
	}
}