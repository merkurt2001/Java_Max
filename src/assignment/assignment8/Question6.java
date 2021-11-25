package assignment.assignment8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		next3(num);

	}

	public static void next3(int num) {
		System.out.println("next 3 are :"+"\n"+ ++num +" "+ ++num +" "+ ++num);
		
	}

}
