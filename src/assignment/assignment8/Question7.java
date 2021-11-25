package assignment.assignment8;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(isPalindrome(num));
	}

	public static boolean isPalindrome(int num) {
		int last, reverse = 0, dummy;

		dummy = num;
		while (num > 0) {
			last = num % 10;
			num = num / 10;
			reverse = (reverse * 10) + last;
		}
		if (reverse == dummy) {
			return true;

		} else {
			return false;

		}

	}

}
