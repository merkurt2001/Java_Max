package Reviews.EU6_review.week10;

import java.util.Arrays;

public class MultiDimensionalArray2 {
	
	public static void main(String[] args) {
		
		//int[][] arr2D = {{1,2}, {3,4,5}};
		
		//					    0       1         0       1  
		int[][][] arr3D = {  {{1,2}, {3,4,5}}, {{6,7}, {8,9,10}}  };
		//				            0                 1
		
		System.out.println( Arrays.deepToString(arr3D) );
		
		// retrieve 2 dimensional array {{6,7}, {8,9,10}} from arr3D
		System.out.println(  Arrays.deepToString( arr3D[1] )  );
		
		// retrieve 1dimensional array {3,4,5} from arr3D
		System.out.println(  Arrays.toString( arr3D[0][1] ) );
		
		// retrieve data 8 from arr3D
		System.out.println( arr3D[1][1][0] );
		
		System.out.println("-------------------------------------------------");
		
		for(int[][] each2D   : arr3D) { // iterates each two dimensional arrays in arr3D
			for(int[] each1D : each2D) { // iterates each single dimensional array from each two dimensional array
				for(int element : each1D) { //iterates each elements from each single dimensional array
					System.out.println(element);
				}
				
			}
		}
		
		
		System.out.println("-----------------------------------------------");
		
		int[][][][] arr4D = {    {{{1,2}, {3,4,5}}, {{6,7}, {8,9,10}}}  ,
							{{{1,2}, {3,4,5}}, {{6,7}, {8,9,10}}}
						};
		
		
		for(int[][][]  each3D  : arr4D) {
			for( int[][] each2D : each3D ) {
				for(int[] each1D : each2D) {
					for(int element : each1D) {
						System.out.println(element);
					}
				}
			}
		}
		
		
		
		
		
		
		
	}
	

}
