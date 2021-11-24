package Reviews.EU6_review.week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.addAll(  Arrays.asList( "Java", "Python", "C#", "C++" , "Java", "Java", "Java")   );
		System.out.println(list);
		//list.remove("Java"); removes one Java
		list.removeAll(  Arrays.asList( "C#", "C++" ) ); // removes all java
		System.out.println(list);
		
		System.out.println("-----------------------------------------------");
		
		
		// reverse
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.addAll( Arrays.asList( 10,30,40,70,20,15,25)   );
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i = list1.size()-1; i>=0 ; i-- ) {
			list2.add( list1.get(i) ) ;
		}
		
		System.out.println(list2);
		
		System.out.println("---------------------------------------------");
		
		// removeDuplicates
		String[] arr = {"Mehmet", "Caglar", "Caglar", "Caglar", "Ebubekir", "Huseyin", "Mehmet", "Mehmet"};
		
		ArrayList<String> names = new ArrayList<>();
		names.addAll( Arrays.asList(arr) );
		System.out.println(names);
		
		ArrayList<String> list3 = new ArrayList<>();//{"Mehmet", "Caglar", Ebubekir", "Huseyin"}
		
		for(String each : names) {
			if(!list3.contains(each)) {
				list3.add(each);
			}
		}
		
		System.out.println(list3);
		
		System.out.println("---------------------------------------------------");
		// unique
		
		ArrayList<Character> characters = new ArrayList<>();
		characters.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'D', 'E', 'E', 'E', 'F'));
		/*
		 	indexOf('B') ==> 2
		 	lastIndexOf('B')==> 2
		 */
		
		ArrayList<Character> unique1 = new ArrayList<>();
		
		for(Character each : characters) {
			if(characters.indexOf(each) == characters.lastIndexOf(each)) {
				unique1.add(each);
			}
		}
		
		System.out.println(unique1);
		
		
		ArrayList<Character> unique2 = new ArrayList<>();
		for(Character each : characters) {
			
			if(Collections.frequency(characters, each) == 1) {
				unique2.add(each);
			}
			
		}
		
		System.out.println(unique2);
		
		
		System.out.println("------------------------------------------------");
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,1,1,1,1,1));
		
		//swap
		Collections.swap(numbers, 3, 8);
		
		System.out.println(numbers);
		
		//replaceAll
		Collections.replaceAll(numbers, 1, 100);
		
		System.out.println(numbers);
		
		//reverse
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		// max, min
		System.out.println( Collections.max(numbers));
		System.out.println(Collections.min(numbers));
		
		// frequency
		System.out.println(  Collections.frequency(numbers, 100) );
		
		
		
	}
	

}
