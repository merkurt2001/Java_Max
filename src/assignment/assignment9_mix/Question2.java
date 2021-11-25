package assignment.assignment9_mix;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
		
	    double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
			
		System.out.println("Select screen size:");
		double sSize = scan.nextDouble();
			
		if (sSize == 13.3) {
			price += 200;
		} else if (sSize == 15.0) {
			price += 300;
		} else {
			price += 400;
		}
		
		scan.nextLine();
		System.out.println("Select CPU type:");
		cpu = scan.nextLine();
			
		if (cpu.equals("i3")) {
			price+=150;
		} else if (cpu.equals("i5")) {
			price+=250;
		} else if (cpu.equals("i7")) {
			price+=350;
		}	
		
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		price = price + (ram/4*50);
			
		scan.nextLine();
		System.out.println("Select storage type:");
		storageType = scan.nextLine();
		if (storageType.equals("HDD")) {
			System.out.println("Enter memory size:");
			int mSize = scan.nextInt();
			price = price + (mSize/500*50);
		} else if (storageType.equals("SSD")) {
			System.out.println("Enter memory size:");
			int mSize = scan.nextInt();
			price = price + (mSize/500*100);
		}
		
		scan.nextLine();
		System.out.println("Enter screen resolution:");
		String sResolution = scan.nextLine();
		if (sResolution.equals("FULLHD")) {
			price+=100;
		}else if (sResolution.equals("4K")) {
			price+=200;
		}
		
		System.out.println("Laptop price is: $" + price);
		
		

	}

}
