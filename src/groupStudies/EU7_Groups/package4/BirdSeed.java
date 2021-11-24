package groupStudies.EU7_Groups.package4;

import java.util.Scanner;

/**
 * @author me
 *
 *
 */
public class BirdSeed {

	public static void main(String[] args) {

		printNext();

	}

	public static void printNext() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number:");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.print(num + " ");
			System.out.print(++num + " ");
			System.out.println(++num);
		} else {
			printNext();
		}
	}
}