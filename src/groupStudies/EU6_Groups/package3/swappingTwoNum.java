package groupStudies.EU6_Groups.package3;

public class swappingTwoNum {

	public static void main(String[] args) {
		
		/*swapping 2 numbers*/
		//first approach using addition and substraction
		
		int first=5;
		int second=10;
		
		first = first + second; //first = 5 + 10 = 15
		second = first - second; // second = 15 - 10 = 5
		first = first - second; // first = 15 - 5 = 10
				
		
		System.out.println("first: "+ first);
		System.out.println("second: "+ second);
		
		//second approach using dummy variable
		
		int dummy;
		
		dummy = first ; // dummy = 5
		first= second; // first = 10
		second= dummy; //second =5 ;
		
		System.out.println("first: "+ first);
		System.out.println("second: "+ second);
		
		//third approach using div and multiplication
		
		first = first * second; //first = 5 * 10 = 50
		second = first / second; // second = 50 / 10 = 5
		first = first / second; // first = 50 - 5 = 10
				
		
		System.out.println("first: "+ first);
		System.out.println("second: "+ second);
		
		
		
		

	}

}
