package groupStudies.EU7_Groups.package7;

import java.util.Arrays;

public class ArrayMoveAllZerosToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3,5,7,0,5,0,2,0,0,0,3,6,8};
		System.out.println(Arrays.toString(moveZeros(array)));
		

	}

	private static int [] moveZeros(int[] array) {
		
		int[] result = new int[array.length];
		int begin=0;
		
		for (int each : array) {
			if (each != 0) {
				result[begin++]=each;
			}
		}
		
	
		
		
//		int begin=0;
//		int end = array.length-1;
//		for (int i = 0; i < result.length; i++) {
//			
//			if (array[i]!=0) {
//				result[begin]=array[i];
//				begin++;
//			}else if (array[i]==0) {
//				result[end]=array[i];
//				end--;
//			}
//			
//		}
	
		return result;
	}


}
