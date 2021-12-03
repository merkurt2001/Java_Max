package lambda.LambdaExp;

import java.util.ArrayList;
import java.util.List;

public class MoreLambdas {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

		strings.removeIf(string -> string.startsWith("t"));

		strings.forEach(string -> System.out.println(string));

	}

}
