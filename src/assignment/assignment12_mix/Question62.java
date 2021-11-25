package assignment.assignment12_mix;

import java.util.ArrayList;

public class Question62 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(5);
		arrList.add(10);
		arrList.add(15);
		arrList.add(50);
		
		System.out.println(ints(arrList));
		
	}
	
	public static int ints(ArrayList<Integer> al) {
		
		int sum=0;
		for(int each : al) {
			sum+=each;
		}
		
		return sum;
		
	}

}
