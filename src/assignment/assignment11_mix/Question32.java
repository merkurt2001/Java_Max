package assignment.assignment11_mix;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Strings:");
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}

		
		String firstThree = "";
		for (int i = 0; i < 5; i++) {
			firstThree = arr[i].substring(0, 3);
			System.out.println(firstThree);
		}

	}

}
