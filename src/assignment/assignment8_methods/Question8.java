package assignment.assignment8_methods;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Input:");
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    int previousNumber=0;
	    int nextNumber=1;
	    for (int i = 1; i < num-1; i++)
		     {
		       int sum = previousNumber + nextNumber;
		       previousNumber = nextNumber;
		       nextNumber = sum;
		     }
		   System.out.println(nextNumber);  
	  }
	  

}
