package lambda.LambdaExp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingComparators {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
//comparing list alphabetical order
		Comparator<String> cmp = (String s1, String s2) -> s1.compareTo(s2);

		strings.sort(cmp);
		System.out.println(strings);
//comparing by the length of the string --first app.
		Comparator<String> cmp2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		strings.sort(cmp2);
		System.out.println(strings);
		
		System.out.println("=====================");
		//comparing by the length of the string --second app.
		
		Function<String, Integer> toLength1 = s->s.length();
		
		Comparator<String> cmp3 = Comparator.comparing(toLength1);
		strings.sort(cmp3);
		System.out.println(strings);
		
		System.out.println("=====================");
		//comparing by the length of the string --third app. --there is no boxing here
		
		ToIntFunction<String> toLength2 = s->s.length();
		
		Comparator<String> cmp4 = Comparator.comparingInt(toLength2);
		strings.sort(cmp4);
		System.out.println(strings);

	}

}
