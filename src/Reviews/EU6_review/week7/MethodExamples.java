package Reviews.EU6_review.week7;

public class MethodExamples {
	
	public static void main(String[] args) {
		helloWorld();
		
		String s = helloWorld2();
		System.out.println(s);
		
		System.out.println(helloWorld2());
		
		
		printMessage("week 7");
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	
	public static String helloWorld2() {
		return "Hello World";
	}
	
	public static void printMessage(String msg) {
		System.out.println(msg + msg);
	}
	

}
