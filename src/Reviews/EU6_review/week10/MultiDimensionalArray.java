package Reviews.EU6_review.week10;

import java.util.Arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		//					 0       1
		String[] group1 = {"Ahmet","Ali"};
		String[] group2 = {"Cemil","Cem","Saar"};
		//					 0       1      2
		String[] group3 = {"Volkan", "Selami","Selcuk","Yunus"};
		//				     0         1         2        3
		String[] group4 = {"Kubra", "Hatice", "Yakup"};
		//					 0         1         2
		
		
		String[][] students = { group1, group2, group3, group4 };
		//				          0       1        2       3
		
		// printing multi-dimensional array
		System.out.println( Arrays.deepToString(students) );
		
		
		// retrieve the members of group3
		System.out.println(  Arrays.toString( students[2]) );
		
		// retrieve the name Yakup
		String name = students[3][2];
		System.out.println(name);
		
		
		System.out.println("------------------------------------------------");
		// 				    0   1   2       0  1      0   1   2   3      
		int[][] arr2D = {  {10, 20, 30} , {40, 50}, {60, 70, 80, 90} };
		//					  0               1            2
		
		for(int i = 0; i <= arr2D.length-1; i++) { // 1: represents the index numbers of single dimensional arrays
			int[]  each1D = arr2D[i];  // getting each single dimensional array from arr2D
			System.out.println( Arrays.toString(each1D));
			
			for(int j = 0; j <= each1D.length-1; j++  ) {
				int eachElement = each1D[j]; // getting each elements from each single dimensional array
				System.out.println(eachElement);
			}
			
		}
		
		System.out.println("---------------------------------------------");
		
		for(int[] each1D : arr2D ) {
			for(int element : each1D ) {
				System.out.println(element);
			}
		}
		
		
		
	}

}
