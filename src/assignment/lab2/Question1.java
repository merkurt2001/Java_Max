package assignment.lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number:");
		int firstnumber=sc.nextInt();
		int smallest=firstnumber;
		int largest=firstnumber;
		

		while(true) {
			
			System.out.print("Enter your next number:");
			int number=sc.nextInt();
			
			if(number>largest) {
				largest=number;
				
			}else if(number<smallest) {
				smallest=number;
				
			}
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			int ans = sc.nextInt();
			if(ans==1) {
				continue;
			}else {
				break;
			}
			
		}
		
		System.out.println("Smallest Number is:" + smallest);
		System.out.println("Largest Number is:" +largest);

	}

}
