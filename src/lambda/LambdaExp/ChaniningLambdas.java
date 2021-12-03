package lambda.LambdaExp;

import java.util.function.Consumer;
import java.util.function.Predicate;


/**
 * @author me chaning lambdas
 *
 */
public class ChaniningLambdas {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println("c1 consumer " + s);
		Consumer<String> c2 = s -> System.out.println("c2 consumer " + s);
		c1.accept("hello");
		c2.accept("world");

		// chaning here
		Consumer<String> c3 = s -> {
			c1.accept(s);
			c2.accept(s);
		};
		c3.accept("Hello World");

		// chaninig with andThen method

		Consumer<String> c4 = c1.andThen(c2);

		c4.accept("Good morning");

		System.out.println("================");

		Predicate<String> isNull = s -> s == null;

		System.err.println("For null = " + isNull.test(null));
		System.out.println("For hello = " + isNull.test("hello"));

		System.out.println("===============");

		Predicate<String> isEmpty = s -> s.isEmpty();

		System.err.println("For empty = " + isEmpty.test(""));
		System.out.println("For hello = " + isEmpty.test("hello"));
		
		System.out.println("===============");
//to check not empty nor null, using negate and "and"
		Predicate<String> p = isNull.negate().and(isEmpty.negate());

		System.out.println("For empty = " + p.test(""));
		System.out.println("For null = " + p.test(null));
		System.out.println("For hello = " + p.test("hello"));

	}

}
