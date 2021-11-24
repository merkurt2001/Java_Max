package Replit;

import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {
		int[] ints1 = { 1, 2, 3, 4, 5 };
		int[] ints2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(addElements(ints1, ints2)));
	}

	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] newArray = new int[ints1.length];
		for (int i = 0; i < ints1.length; i++) {
			newArray[i] += ints1[i] + ints2[i];
		}
		return newArray;

	}
}
