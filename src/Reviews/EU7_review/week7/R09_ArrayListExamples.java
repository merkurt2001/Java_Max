package Reviews.EU7_review.week7;

import java.util.ArrayList;
import java.util.Arrays;

public class R09_ArrayListExamples {

	public static void main(String[] args) {
		
		String[] arr = {"Java","C#","C++","Python"};
		
		ArrayList<String> list = new ArrayList<>();
	
// Arrays utility class Arrays.asList	
		
		list.addAll(Arrays.asList(arr));
		
		System.out.println(list);
		
		
		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(arr));
		System.out.println(listTwo);
		
		ArrayList<String> listThree = new ArrayList<>(Arrays.asList("C#","C++"));
		System.out.println(listThree);
		
		list.addAll(listTwo);
		list.addAll(listThree);
		System.out.println(list);
		
		list.removeAll(listThree); // [Java, Python, Java, Python]
		System.out.println(list);
		
		
		
		
	}
}
