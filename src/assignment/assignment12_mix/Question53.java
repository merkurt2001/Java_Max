package assignment.assignment12_mix;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	  
	    double total = 0;
		int i = 0;

		while (i < 7) {
			System.out.println("Enter score for judge " + (i + 1) + ":");
			score[i] = input.nextFloat();
			i++;
		}

		System.out.println("Enter difficulty:");
		float difficulty = input.nextFloat();

		float highest = score[0];
		for (int j = 0; j < 7; j++) {
			if (score[j] > highest) {
				highest = score[j];
			}
		}

		float lowest = score[0];

		for (int j = 0; j < 7; j++) {
			if (score[j] < lowest) {
				lowest = score[j];
			}
		}

		for (int j = 0; j < 7; j++) {
			if (score[j] != highest && score[j] != lowest) {
				total = total + score[j];
			}
		}

		total = total * difficulty * 0.6;

	    System.out.printf("Total: %.2f", total);

	}

}
