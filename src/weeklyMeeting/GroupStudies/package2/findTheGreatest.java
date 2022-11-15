package weeklyMeeting.GroupStudies.package2;

import java.util.Scanner;

public class findTheGreatest {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter first number");
		num1= scanner.nextInt();
		
		System.out.println("please enter second number");
		num2= scanner.nextInt();
		
		System.out.println("please enter third number");
		num3= scanner.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1 + " is the biggest number");
		}else if ( num2>num3) {
			System.out.println(num2 + " is the biggest number");
		} else {
			System.out.println(num3 + " is the biggest number");
		}

	}

}
