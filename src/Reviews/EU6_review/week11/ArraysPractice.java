package Reviews.EU6_review.week11;

public class ArraysPractice {
	
	public static void main(String[] args) {
		int[] numbers = {100, -10, 200, 40, 50, 0, 1000, 500};
		int max =Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int each : numbers) {
			if(each > max) { // only assign the largest number
				max = each;
			}
			
			 if( each < min) { // only assign the smallest number 
				 min = each;
			 }
			
		}
		
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		System.out.println("-----------------------------------------------");
		int[][] arr2D = { {100, 200, 300} , {40, 5000}, {200, 300, 1000} };
		int max2 = Integer.MIN_VALUE; 
		int min2 = Integer.MAX_VALUE;
		
		for(int[] each1D : arr2D ) { // getting each single dimensional array from arr2D
			for(int eachElement : each1D ) {
				if(eachElement > max2) {
					max2 = eachElement;
				}
				
				if(eachElement < min2) {
					min2 = eachElement;
				}
				
			}
		}
	
		
		
		System.out.println("max2: "+max2);
		System.out.println("min2: "+min2);
		
		/*
		for(int i = 0; i < arr2D.length; i++) { //i: index of each single dimensional array
			for(int j = 0; j< arr2D[i].length; j++ ) {//j :index of elements in each single dimensional array
				if(arr2D[i][j] > max2  ) {
					max2 = arr2D[i][j];
				}	
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}