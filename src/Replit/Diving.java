import java.util.Scanner;

public class Diving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		// WRITE YOUR CODE HERE
		float max = score[0], min = 11, sum = 0;
		float total = 0, diff;
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter score for judge " + (i+1) + ":");
			score[i] = input.nextFloat();
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
			sum = sum + score[i];
		}
		sum = sum - max - min;
		System.out.println("Enter difficulty: ");
		diff = input.nextFloat();
		total = sum * diff * 0.6f;

		// FINAL OUTPUT
		System.out.printf("Total: %.2f", total);
	}
}