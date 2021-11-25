package assignment.assignment5_selectionStatements;

public class Question9 {

	public static void main(String[] args) {
		
		int myNumber = 12345;
		int firstDigit =   myNumber / 10000;
		int secondDigit = (myNumber % 10000) / 1000;
		int thirdDigit =  ((myNumber % 10000) % 1000)/100;
		int fourthDigit = (((myNumber % 10000) % 1000)%100)/10;
		int fifthDigit =  myNumber % 10;

		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		System.out.println(fourthDigit);
		System.out.println(fifthDigit);
		
	
		
		 

	}

}


	
  