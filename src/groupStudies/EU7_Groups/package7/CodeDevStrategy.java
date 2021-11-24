package groupStudies.EU7_Groups.package7;

import java.util.Arrays;

/**
 * @author me // PROBLEM 1: We work for a company building a smart home
 *         thermometer. Our most recent task is this: "Given an array of
 *         temperatures of 2 days, calculate the temperature amplitude. Keep in
 *         mind that sometimes there might be a sensor error (404-error message)."
 *
 */
public class CodeDevStrategy {
	
	// 1) Understanding the problem
	// - What is temp amplitude? Answer: difference between highest and lowest temp
	// - How to compute max and min temperatures?
	// - What's a sensor error? And what do do?

	// 2) Breaking up into sub-problems
	// - How to ignore errors?
	// - Find max value in temp array
	// - Find min value in temp array
	// - Subtract min from max (amplitude) and return it
	
	// PROBLEM 2:
	// Function should now receive 2 arrays of temps

	// 1) Understanding the problem
	// - With 2 arrays, should we implement functionality twice? NO! Just merge two arrays

	// 2) Breaking up into sub-problems
	// - Merge 2 arrays

	public static void main(String[] args) {

		int[] temps = { 3, -2, -6, -1, 404, 9, 13, 17, 15, 14, 9, 5 };
		int[] temps1 = { 22, 404, 9, 13, 404, -15 };
		
		int amplitude = calcTempAmplitude(temps);
		
		
		System.out.println(amplitude);
		

	}

	public static int mergeArrays(int[] temps, int[] temps1) {
		int[] both = Arrays.copyOf(temps, temps.length + temps1.length);
		System.arraycopy(temps1, 0, both, temps.length, temps1.length);
		System.out.println(Arrays.toString(both));
		return calcTempAmplitude(both);
		
	}

	public static int calcTempAmplitude(int[] temps) {

		int max = temps[0];
		int min = temps[0];

		for (int i = 1; i < temps.length; i++) {
			if ((temps[i] == 404)) {
				continue;
			} else {
				if (temps[i] > max) {
					max = temps[i];
				}
				if (temps[i] < min) {
					min = temps[i];
				}
			}

		}
		System.out.println(max);
		System.out.println(min);
		return max - min;

	}
	

}
