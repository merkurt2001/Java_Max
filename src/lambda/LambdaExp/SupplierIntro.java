package lambda.LambdaExp;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierIntro {

	public static void main(String[] args) {
		
		Supplier<String> providedStr = ()->new String("your str");
		System.out.println(providedStr.get());
		
		Supplier<Integer> randomNumber = ()->new Random().nextInt();
		System.out.println(randomNumber.get());

	}

}
