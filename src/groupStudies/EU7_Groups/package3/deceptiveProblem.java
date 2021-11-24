package groupStudies.EU7_Groups.package3;

public class deceptiveProblem {

	public static void main(String[] args) {
		/*
		 * Write a for loop that displays numbers from 1 to 5, seperated by commas
		 * 
		 * output should be like;
		 * 
		 * 1,2,3,4,5
		 */

		System.out.print(1);

		for (int i = 2; i <= 5; i++) {
			System.out.print(", " + i );
		}
		System.out.println(); // to end the line of output
		
		
		String comma = "";
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(comma + i);
			comma = ", ";
			
		}
		System.out.println(); // to end the line of output

	}

}
