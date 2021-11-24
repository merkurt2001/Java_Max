package Reviews.EU6_review.week9;

public class StringPractice1 {
	
	public static void main(String[] args) {
		
		String str1 = "Cybertek";
		String str2 = "Cybertek"; // String pool: "Cybertek"
		
		String str3 = new String("Cybertek"); // heap: "Cybertek"
		String str4 = new String("Cybertek"); // heap: "Cybertek"
		
		String str5 = "cybertek"; // String pool: "cybertek"
		String str6 = new String("cybertek"); // heap: "cybertek"
		
		System.out.println(str1 == str2); // true
		System.out.println(str3 == str1); // false
		System.out.println(str3 == str2); // false
		System.out.println(str3 == str4); // false
		System.out.println(str5 == str2); // false
		System.out.println(str5 == str6); // false
		
		System.out.println("--------------------------------------");
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str3.equals(str1)); // true
		System.out.println(str3.equals(str2)); // true
		System.out.println(str3.equals(str4)); // true
		System.out.println(str5.equals(str2)); // false. to ignore the case sensitivity: equalsIgnoreCase()
		System.out.println(str5.equals(str6)); // true
		
		System.out.println("---------------------------------------");
		String s1 = "JAVA";
		String s2 = "java";
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		
		
		
		
	}
	

}
