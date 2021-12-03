package lambda.LambdaExp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorIntro {

	public static void main(String[] args) {
		//compare according to last char
		Comparator<String> lastCharComparator = 
				//(o1, o2)-> o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1));
		Comparator.comparing(str-> str.substring(str.length()-1)); //using ready comparing method
		
		
		List<String> names = new ArrayList<>();
		names.add("james");
		names.add("jhon");
		names.add("alexander");
		names.add("daina");
		names.add("johnattan");
		
		names.sort(lastCharComparator);
//		sorted by last char
		for (String each : names) {
			System.out.println("each item : " + each);
		}
		
		//second approach using compare func inside sort method compare according to second index
		
		names.sort(Comparator.comparing(str-> str.substring(2,3)));
		
		for (String each : names) {
			System.out.println("each item : " + each);
		}
		
		
		//replaceAll method 
		names.replaceAll(str->str.substring(str.length()-2));
		
		for (String each : names) {
			System.out.println("each item : " + each);
		}
	}

}
