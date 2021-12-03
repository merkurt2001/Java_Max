package lambda.LambdaExp;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

	public static void main(String[] args) {
		
		IntSupplier supplier= ()-> 10;
		int asInt = supplier.getAsInt();
		System.out.println("asInt = "+ asInt);
		
		DoubleToIntFunction function= value-> (int)Math.floor(value);
		int applyAsInt =function.applyAsInt(Math.PI);
		System.out.println(applyAsInt);
		
		
		
		
	}

}
