package lambda.LambdaExp;

import java.util.function.Consumer;

public class StringDoublePrinter implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t + "||" + t);
		
	}
	


}
