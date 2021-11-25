package assignment.assignment11_mix;

import java.util.Arrays;
import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size:");
		
		int size = scan.nextInt();
		int[] num = new int[size];
		
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}

		int[] numNew = null;
		
		if (size >= 2) {
			numNew = new int[2];
			numNew[0] = num[0];
			numNew[1] = num[1];
		}

		if (size == 1) {
			numNew = new int[1];
			numNew[0] = num[0];
		}

		System.out.println(Arrays.toString(numNew));

	}

}
