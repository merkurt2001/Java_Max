package Reviews.EU7_review.week9;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticMethods.displayMessage("Hello EVerybody");
		
		StaticMethods obj = new StaticMethods();
		
		obj.displayMessage("ANother way of calling static methods");
		
		// StaticMethods.instanceMethod;  need to call with the object
		
		obj.instanceMethod();
		

	}

}
