package lambda.LambdaExp;

import java.util.*;
import java.util.function.Predicate;

public class PredicateIntro {

	public static void main(String[] args) {
		//conventional way
//		Predicate<String> moreThan5Char = new MoreThan5CharChecker();
		
		
		//with lambda
		Predicate<String> moreThan5Char = t->t.length()>5;
		
		List<String> names = new ArrayList<>();
		names.add("james");
		names.add("jhon");
		names.add("alexander");
		names.add("daina");
		names.add("johnattan");
		
		names.removeIf(moreThan5Char);
		System.out.println(names);
		
		names.removeIf(name->name.length()>4);
		System.out.println(names);
		
		
		
	}

}
