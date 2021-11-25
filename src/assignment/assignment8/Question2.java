package assignment.assignment8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		cube();

	}

	public static void cube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int cube = num * num * num;
		System.out.println("Cube of your number is " + cube);
	}
}
