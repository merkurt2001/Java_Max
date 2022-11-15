package weeklyMeeting.GroupStudies.package3;

public class swappingNumbers {

	public static void main(String[] args) {
		/* swapping 2 numbers */

		int first = 5;
		int second = 10;

		System.out.println("first is " + first);
		System.out.println("second is " + second);
		
		//first approach
		
		int dummy;
		
		dummy = first;//dummy =5
		first = second; // first =10
		second = dummy; // second=5
		
		System.out.println("first is " + first);
		System.out.println("second is " + second);
		
		//second approach using math
		
		first = first + second; //first = 5+10
		second = first - second; // second = 15+10= 5
		first = first - second; // first =15-5=10
		
		System.out.println("first is " + first);
		System.out.println("second is " + second);
		
		
		
	
		

	}

}
