package assignment.assignment6_forLoop;

public class Question2 {
	
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

	public static void main(String[] args) {
		
		int count = 8;
		int pre1 = 0, pre2 = 1;
		
		System.out.println("Fibonacci Series of "+count+" numbers:");
		
		System.out.print(pre1 + " ");
		
		for (int i = 1; i < count; ++i){
		    
			System.out.print(pre2 + " ");
			
		   int sumOfPrevTwo = pre1 + pre2;
		   pre1 = pre2;
		   pre2 = sumOfPrevTwo;
		   
		   /* On each iteration, we are assigning second number to the first number and 
			 * assigning the sum of last two
			 * numbers to the second number*/
				
		}

	}

}
