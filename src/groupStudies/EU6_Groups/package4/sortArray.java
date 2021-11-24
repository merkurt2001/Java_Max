package groupStudies.EU6_Groups.package4;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int[] intArray = { 7, 9, 5, 1, 3, 33, 22, 0, 44 };

		System.out.println(Arrays.toString(insertionSort(intArray)));

	}

	public static int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int current = array[i]; // current=7,  9 
			int j=i-1;
			while (j>=0&& array[j]>current) { //   9
				array[j+1]=array[j];
				j--;
				
			}
			array[j+1]=current;
		}
		return array;
	}

}
