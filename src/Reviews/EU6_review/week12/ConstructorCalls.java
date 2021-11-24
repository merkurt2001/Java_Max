package Reviews.EU6_review.week12;

public class ConstructorCalls {
	
	
	public void method1() {
		
	}
	
	public void method2() {
		method1();
	}
	
	public ConstructorCalls() {
		//this(); // 4. Constructor cannot call itself
		//this(10);
		method1();
	}
	
	
	public void method3() {
		method1();
		method2();
		// ConstructorCalls(); // 1. constructor cannot be called by the name ( need this() or super() )
		// this();  // 2. only a constructor can call another constructor
	}
	
	public ConstructorCalls(int a) {
		this();
		System.out.println("B "); 
		//this(); //3. constructor call MUST be at the first step	
	}
	
	public ConstructorCalls(String a) {
		this(); 
		//this(10); //5. A constructor can only call one constructor
		
	}
	
	
	

}
