package groupStudies.EU6_Groups.package5;

import java.util.Arrays;

public class reverseArray {

	// reverse any given integer array
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[array.length - 1-i];
		}
		return result;
	}

	// reverse any given double array
	public static double[] reverse(double[] array) {
		double[] result = new double[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[array.length - 1-i];
		}
		return result;
	}

	// reverse any given char array
	public static char[] reverse(char[] array) {
		char[] result = new char[array.length];
		for (int i = 0 ; i < result.length; i++) {
			result[i] = array[array.length - 1-i];
		}
		return result;
	}

	// reverse any given String array
	public static String[] reverse(String[] array) {
		String[] result = new String[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[array.length - 1-i];
		}
		return result;
	}
}
