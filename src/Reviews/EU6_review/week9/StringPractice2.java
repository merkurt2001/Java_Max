package Reviews.EU6_review.week9;

public class StringPractice2 {
	
	
	public static void main(String[] args) {
		
		String str = "CYBERTEK"; // immutable
		
		str = str.toLowerCase();  //"cybertek"  (new object)
		
		System.out.println( str );
		
		String str2 = "Python Programming";
		str2 = null;
		
		System.out.println(str2);
		// System.out.println(str2.toLowerCase());
		
		
	}
	

}
