package assignment.assignment10_mix;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the HTML:");
	    String html = scan.nextLine();
	  
	  if (html.contains("<html>")) {
		  int start = html.indexOf("id=");
		  String sub = html.substring(start+3, html.length());
		  int tagCloseInd = sub.indexOf(">");
		  System.out.println(sub.substring(0, tagCloseInd).replace("\"", ""));
	  }else{
		  System.out.println("Invalid input!");
	  }
	  
	}

}



