package Reviews.EU6_review.week12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
	
	
	public static void main(String[] args) {
		
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
	  //array[5] = 60;
		
		System.out.println( Arrays.toString(array));
		
		System.out.println("---------------------------------------------");
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);  //0
		arrayList.add(20);	//1
		arrayList.add(30);	//2
		arrayList.add(40);	//3
		arrayList.add(50);	//4
		arrayList.add(60);	//5
		arrayList.add(70);	//6
		arrayList.add(80);	//7
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size()); //8
		
		// remove the element 40
		arrayList.remove(3);  // remove by index
		//arrayList.remove( Integer.valueOf(40)); // remove by object
		
		
		arrayList.set(1, 400);
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		 // verify if arraylist has 50
		boolean r1 =arrayList.contains(50);
		System.out.println(r1);
		
		System.out.println(arrayList.indexOf(60));
		
		System.out.println(arrayList.get(4));
		
		System.out.println("-------------------------------------------------");
		
		for(int i = 0; i < arrayList.size(); i++ ) {
			arrayList.set(i,  arrayList.get(i)*2 );
		}
		
		System.out.println(arrayList);
		
		System.out.println("------------------------------------------------");
		
		for(int each  : arrayList) {
				System.out.println(each);
		}
		
		
		
	}
	

}
