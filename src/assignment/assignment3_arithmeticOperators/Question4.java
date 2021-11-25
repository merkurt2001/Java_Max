package assignment.assignment3_arithmeticOperators;

/*
Question-4

Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2

      Sample output:

      n1=10
      n2=20

      ----------

      n1=20
      n2=10
      
*/

public class Question4 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		/*
		//Option-1
		
		int n3;
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		*/
		
		//Option-2
		
		n2 = n1 + n2; //n2=30
		n1 = n2 - n1; //30-10=20  n1=20 n2=30
		n2 = n2 - n1; //30-20=10 n1=20 n2=10
		
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		
		
		

	}

}
