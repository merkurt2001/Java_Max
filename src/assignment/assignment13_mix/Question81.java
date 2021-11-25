package assignment.assignment13_mix;

import java.util.Random;
import java.util.Scanner;

public class Question81 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("How much money do you want to Enter");
		double money = scan.nextDouble();
		
		String answ;
		String[] word = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
		
		Random rn = new Random();
		double sum=0;
		double sumEnt = 0;
		
		do {
			int CCount = 0, OCount = 0, PCount = 0, BeCount = 0, MCount = 0, BaCount = 0;
			
			for (int i = 1; i<=3; i++) {
				int sword = rn.nextInt(word.length);
				if (sword == 0) {
					System.out.println("Cherries");
					CCount++;
				} else if (sword == 1) {
					System.out.println("Oranges");
					OCount++;
				} else if (sword == 2) {
					System.out.println("Plums");
					PCount++;
				} else if (sword == 3) {
					System.out.println("Bells");
					BeCount++;
				} else if (sword == 4) {
					System.out.println("Melons");
					MCount++;
				} else {
					System.out.println("Bars");
					BaCount++;
				}
			}
			
			if (CCount==2 || OCount == 2 || PCount==2 || BeCount==2 || MCount == 2 || BaCount == 2) {
				double win = money * 2;
				System.out.println("Your winning amount: " + win);
				sum+=win;
			} else if (CCount == 3 || OCount == 3 || PCount==3 || BeCount==3 || MCount == 3 || BaCount == 3) {
				double win = money * 3;
				System.out.println("Your wining amount: " + win);
				sum +=win;
			} else {
				System.out.println("You lost " + money);
				sum-=money;
			}
		
			sumEnt += money;
			scan.nextLine();
		
			System.out.println("Would you play again");
			answ = scan.nextLine();
		
			if (answ.equalsIgnoreCase("Yes")) {
				System.out.println("How much money do you want to Enter");
				money = scan.nextDouble();
			}
		
		} while (answ.equalsIgnoreCase("Yes"));
			System.out.println("Total amount you enter: " + sumEnt);
			System.out.println("Total win amount: " + sum);
		}

	}


