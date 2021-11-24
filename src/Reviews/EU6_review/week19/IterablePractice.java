package Reviews.EU6_review.week19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,1,1,1));
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < 5) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		
		System.out.println("----------------------------------------");
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,1,1,1));
		
		Iterator<Integer> it = list2.iterator();
		
		while(it.hasNext()) {
			if( it.next() < 5) {
				it.remove();
			}
		}
		
		System.out.println(list2);
		
		System.out.println("-----------------------------------------");
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,1,1,1));
		list3.removeIf(p -> p <5);
		
		System.out.println(list3);
		
		
	}
	

}
