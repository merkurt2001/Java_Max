package assignment.assignment5_selectionStatements;

public class Question7 {

	public static void main(String[] args) {
		
		
		int num1=20, num2=30,num3=100;
		
		if ((num3 < num1) && (num1 < num2)) {
			
			System.out.println("Medium value is : " + num1);
			
		} else if ((num2 < num1) && (num1 < num3)) {
			
			System.out.println("Medium value is : " + num1);
			
		} else if ((num3 < num2) && (num2 < num1)) {
			
			System.out.println("Medium value is : " + num2);
			
		} else if ((num1 < num2) && (num2 < num3)) {
			
			System.out.println("Medium value is : " + num2);
			
		} else {
			
			System.out.println("Medium value is : " + num3);
		}

	}

}
