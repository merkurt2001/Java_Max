package Reviews.EU7_review.week4;

public class GarbageExample {

	public static void main(String[] args) {
	
		String str = "JAVA";
		
		str = "python"; // "JAVA" object is unreferenced and eligible for garbage collection
		
		System.out.println(str);
		
		
		str = null;  // "python" is unreferenced and eligible for garbage collection
		System.out.println(str);
		
		
	}

}
