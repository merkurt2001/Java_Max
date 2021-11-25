package assignment.assignment8_methods;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter buyPrice:");
	    int buyPrice = scan.nextInt();
	    System.out.print("Enter sellPrice:");
	    int sellPrice = scan.nextInt();
	    
	    System.out.println(c_profits(buyPrice, sellPrice));

	}
	
	public static String c_profits (int buyPrice,int sellPrice){
	    
	   if(sellPrice>buyPrice) {
	     return "profit";
	   } else if (buyPrice>sellPrice) {
	     return "loss";
	   } else {
	     return "no loss";
	   }
	   
	}

}
