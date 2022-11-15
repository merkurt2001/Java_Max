package weeklyMeeting.GroupStudies.Arrays;

import java.util.Arrays;

public class passingArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		changeArray2(array);
		System.out.println(Arrays.toString(array));

	}

	public static int[] changeArray2(int[] array){

        int[] newArray = new int[array.length];

        int index = 0;

        for (int i = 0; i < newArray.length; i++) {
            newArray[index] = array[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));

        index = 0;

        for (int i = array.length-1; i >= 0; i--) {
            array[index] = newArray[i];
            index++;
        }
        System.out.println(Arrays.toString(array));

        return array;
    }
}