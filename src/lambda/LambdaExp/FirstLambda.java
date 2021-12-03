package lambda.LambdaExp;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambda {

	public static void main(String[] args) {
		// supplier
		Supplier<String> supplier = () -> {
			System.out.println("I am inside supplier");
			return "Hello";
		};

		String string = supplier.get();
		System.out.println(string);

		// consumer
		Consumer<String> consumer = (String s) -> {
			System.out.println("I am inside the consumer");
			System.out.println(s);
		};

		consumer.accept("Hello");

	}

}
