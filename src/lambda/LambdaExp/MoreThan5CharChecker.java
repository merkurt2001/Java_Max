package lambda.LambdaExp;

import java.util.function.Predicate;

public class MoreThan5CharChecker implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.length()>5;
	}

}
