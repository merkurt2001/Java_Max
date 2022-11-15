package weeklyMeeting.GroupStudies.Arrays;

import java.util.Arrays;


public class Merge2Arrays {

	public static void main(String[] args) {

		int[] firstArray = { 23, 45, 12, 78, 4, 90, 1 }; 

		int[] secondArray = { 77, 11, 45, 88, 32, 56, 3 }; 
		
		//output int mergeArray = {23, 45, 12, 78, 4, 90, 1, 77, 11, 45, 88, 32, 56, 3  }
		
	
		int [] mergeArray = new int [firstArray.length+secondArray.length];
		
		int pos=0;
		for (int arr : firstArray) {
			mergeArray[pos] = arr;
			pos++;
		}
		System.out.println(Arrays.toString(mergeArray));
		System.out.println(pos);
		
		for (int arr : secondArray) {
			mergeArray[pos]=arr;
			pos++;
		}
		System.out.println(Arrays.toString(mergeArray));
		System.out.println(pos);
		
		
//		
//		for (int i = 0; i < firstArray.length; i++) {
//			mergeArray[i]=firstArray[i];
//		}
//		System.out.println(Arrays.toString(mergeArray));
//		
//		for (int i = 0; i < secondArray.length; i++) {
//			mergeArray[i+firstArray.length]=secondArray[i];
//		}
//		System.out.println(Arrays.toString(mergeArray));
		

	}

}
