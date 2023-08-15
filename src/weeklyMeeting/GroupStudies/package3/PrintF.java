package weeklyMeeting.GroupStudies.package3;

import java.text.DecimalFormat;

public class PrintF {

	public static void main(String[] args) {


		System.out.print("hello best"); //print without a new line
		System.out.println(" group ever"); //to print an output and jump to next line


		System.out.printf("This is an integer %d%n" ,  5);
		System.out.printf("This is a double %f%n" ,  5.5);
		System.out.printf("%s is %d years old%n" ,  "Alice" , 34);
		System.out.printf("This is a String with upper case %S%n" ,  "hello");

		double pi = 3.142094323;
		System.out.printf("Value of pi: %.2f%n" , pi);//to get rid of to unnecessary decimals

		System.out.printf("|%-8s|%n" , "Left"); //left align
		System.out.printf("|%8s|%n" , "Right"); //right aling


		System.out.printf("Number with leading zeros: %03d%n" ,  7); //james bond


		System.err.println("to print out an error with different color");
		System.out.println("=========================");

		System.out.printf("'%S' %n","cybertek");//'CYBERTEK' uppercase and new line

		System.out.println();
		System.out.println("=========================");

		System.out.printf("%2.6s","Hi are you there");//Hi are
		System.out.println();
		System.out.printf("Hello %s!%n" , "World");//Hi are


		System.out.printf("%d%n" , 10);
		System.out.printf("%f%n" , 10.1);
		System.out.printf("%c%n" , 'a');
		System.out.printf("%C%n" , 'a');
		System.out.printf("%s%n" , "hello");
		System.out.printf("%S%n" , "hello");
		System.out.printf("%b%n" , 5<4);


		//Second Approach
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(pi));

		//Third Approach printf method
		System.out.printf("%.2f", pi);
		System.out.println();

		//Forth Approach String Formatter
		System.out.println(String.format("%.2f", pi));

	}

}
