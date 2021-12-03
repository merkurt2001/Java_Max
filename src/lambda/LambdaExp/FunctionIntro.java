package lambda.LambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionIntro {

	public static void main(String[] args) {

//		Function<String, Integer> lengthGetter = str -> str.length();
//		System.out.println(lengthGetter.apply("hello"));
//
//		Function<String, String> doubleTheStr = str -> str + "-" + str;
//		System.out.println(doubleTheStr.apply("hello"));

//		first with polymorphism
		Function<String, Integer> lengthGetter = new StringLengthGetter();

//		with anonymous inner class
		Function<String, Integer> lengthGetter1 = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};

//		with Lambda expression
		Function<String, Integer> lengthGetter3 = str -> str.length() * 10;

		List<String> names = new ArrayList<>();
		names.add("james");
		names.add("jhon");
		names.add("alexander");
		names.add("daina");
		names.add("johnattan");

		List<Integer> lengthList = new ArrayList<>();

		for (String name : names) {

			lengthList.add(lengthGetter3.apply(name));
		}

		System.out.println(lengthList);

	}

}
