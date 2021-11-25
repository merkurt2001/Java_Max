package assignment.assignment8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		plus();

	}

	public static void plus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("result: " + result);

	}

}
