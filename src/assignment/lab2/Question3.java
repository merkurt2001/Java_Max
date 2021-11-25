package assignment.lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number:");
		int number=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=number;i++) {
			
			sum=sum+i;
			
		}
		
		System.out.println("Sum:" + sum);

	}

}
