package assignment.assignment3_arithmeticOperators;

/*
Question-5

Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds
 */

public class Question5 {

	public static void main(String[] args) {
		
		int inputSeconds,hours,minutes,seconds;
		inputSeconds=3695;
		
		hours = inputSeconds/3600; 
		minutes = (inputSeconds%3600)/60;
		seconds = (inputSeconds%3600)%60;
		
		System.out.println(hours + " hours," + minutes + " minutes," + " and " + seconds + " seconds");

	}

}
