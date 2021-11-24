package Reviews.EU6_review.week10;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
	
	public static void main(String[] args) {
		int[] numbers = {1, 0, 2, 0, 3, 0, 4, 0};
		int[] result = 	new int[numbers.length];	//{1,2,3,4, 0, 0, 0, 0}
		
		
		int j =0 ;
		
		for( int each : numbers ) {
			if( each != 0) {
				result[j++] = each;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		System.out.println("------------------------------");
		int[] num1 = new int[3];  //{0, 0, 0}
		int[] num2 = {1,2,3,4,5}; // {1,2,3,4,5}
		 
		num1 = num2; //{1,2,3,4,5}
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num1));
		
		/*
		 a = "Java"
		 b = "Python"
		 
		 a = b;
		 */
		
		
		System.out.println("--------------------------------");
		
		int[]  arr = {1,1,2,3,3,4,5,5};
		
		for(int element : arr) {
		
			int count  =0 ;
			for( int each : arr ) {
				if(each  == element) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(element);
			}
			
		}
		
		
		/*
		
		// frequency of 1
		int count  =0 ;
		for( int each : arr ) {
			if(each  == 1) {
				count++;
			}
		}
		*/
		
		System.out.println("-------------------------------------");
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int each : nums) {
			sum += each;
		}
		
		double average =  (double)sum/nums.length; // 10.0/3 ==> 3.3333...
		
		
		
	}
	

}
