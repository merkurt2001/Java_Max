package assignment.assignment9_mix;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your point-1:");
	    String start = scan.next();
	    System.out.println("Enter your point-2:");
	    String end = scan.next();
	    
	    if(start.equalsIgnoreCase(end)) {
			System.out.println(start + " found");
			return;
		}
					 
		a: switch (start) {
			case "A":
				switch (end) {
					case "B":
						System.out.println("right: " + end + " found");
						break a ;
					case "C":
						System.out.println("right > down: " + end + " found");
						break a;
					case "D":
						System.out.println("right > down > left: " + end + " found");	
						break a;
					default:
						System.out.println();
				}
			case "B":
				switch (end) {
					case "C":
						System.out.println("down: " + end + " found");
						break a ;
					case "D":
						System.out.println("down > left: " + end + " found");
						break a;
					case "A":
						System.out.println("down > left > up: " + end + " found");	
						break a;
				}
			case "C":
				switch (end) {
					case "D":
						System.out.println("left: " + end + " found");
						break a ;
					case "A":
						System.out.println("left > up: " + end + " found");
						break a;
					case "B":
						System.out.println("left > up > right: " + end + " found");	
						break a;
				}	
			case "D":
				switch (end) {
					case "A":
						System.out.println("up: " + end + " found");
						break a ;
					case "B":
						System.out.println("up > right: " + end + " found");
						break a;
					case "C":
						System.out.println("up > right > down: " + end + " found");	
						break a;
				}
				
			}	

	}

}
