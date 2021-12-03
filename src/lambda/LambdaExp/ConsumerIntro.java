package lambda.LambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIntro {

	public static void main(String[] args) {

		Consumer<String> strPrinter = arg -> System.out.println(arg);
		strPrinter.accept("hello");
		// foreach accept consumer

		Consumer<Integer> squareAreaCalculator = arg -> System.out.println(arg * arg);
		squareAreaCalculator.accept(5);
		System.out.println("========================");
//first approach
		Consumer<String> doublePrinter = new StringDoublePrinter();
		doublePrinter.accept("apple");
		doublePrinter.accept("oracle");
//second approach
//		Consumer<String> doublePrint = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println("I used anonymous inner class instead of polymorphism");
//				
//			}
//			
//		};

//		third approach with lambda

		Consumer<String> doublePrinter1 = t -> System.out.println(t + " || " + t);

		List<String> names = new ArrayList<>();
		names.add("james");
		names.add("jhon");
		names.add("alexander");
		names.add("daina");
		names.add("johnattan");
		
		names.forEach(doublePrinter1);
//		different usage of foreach
		
		names.forEach(each->System.out.println(each+each+each));
	

	}

}
