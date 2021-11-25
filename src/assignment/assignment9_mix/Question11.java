package assignment.assignment9_mix;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your message:");
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    int  bracket1=message.indexOf("<");
		int  bracket2=message.indexOf(">");
		int  bracket3=message.indexOf("[");
		int  bracket4=message.indexOf("]");
		int  bracket5=message.indexOf("{");
		int  bracket6=message.indexOf("}");
		    
		sender=message.substring(bracket1+1, bracket2);
		phoneNumber=message.substring(bracket3+1, bracket4);
		messageBody=message.substring(bracket5+1, bracket6);
		
		System.out.println("Sender: " + sender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Message body: " + messageBody);

	}

}
