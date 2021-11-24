import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE
		int num1 = 0, num2 = 1;
		int count = 1;

		while (count <= num) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			count++;
		}
		System.out.print(num1);
	}
}