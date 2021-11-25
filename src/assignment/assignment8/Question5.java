package assignment.assignment8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(sign(num));

	}

	public static int sign(int num) {
		if (num < 0) {
			return -1;
		} else if (num > 0) {
			return 1;
		} else {
			return 0;
		}

	}

}
