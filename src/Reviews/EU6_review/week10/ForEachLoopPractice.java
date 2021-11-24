package Reviews.EU6_review.week10;

public class ForEachLoopPractice {
	
	public static void main(String[] args) {
		String[] str = {"A", "B", "C", "D", "E", "F", "G"};
		
		for(int i = 0; i <= str.length-1; i++ ) {
			//System.out.println( i );
			System.out.println( str[i] );
		}
		
		//System.out.println(i);
		
		System.out.println("------------------------------");
		
		for(String each : str ) {
			System.out.println(each);
		}
		
		System.out.println("-----------------------------------");
		
		int[] arr = {1, 2, 30, 4, 5, 25, 15, 5};
		int max = arr[0]; //1
		int min = arr[0];
		
		for(int each : arr) {
			max = Math.max(max, each);
			min = Math.min(min, each);
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		
		
		
		
	}
	

}
