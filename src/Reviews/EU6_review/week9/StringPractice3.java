package Reviews.EU6_review.week9;

public class StringPractice3 {
	
	
	public static void main(String[] args) {
		
		String str = "Cybertek";
		// index:     01234567
		
		char thirdChar = str.charAt(2); //b
		
		char lastChar = str.charAt( str.length() - 1  ); //k
		
		System.out.println("------------------------------------------");
		String firstName = "Aaron";
		String lastName = "King";
		
		String initial = firstName.charAt(0) + "." +lastName.charAt(0)+".";
		
		System.out.println("Initial: "+initial);
		
		System.out.println("------------------------------------------");
		
		String emailAddress = "CybertekSchool@yahoo.com";
		
		boolean isGmail = emailAddress.endsWith("@gmail.com");
		
		System.out.println(isGmail);
		
		
		System.out.println("---------------------------------------------");
		
		String email = "John.Daniel@cybertekschool.com";
		
		String domain = email.substring( email.indexOf("@")+1  ,  email.lastIndexOf(".") );
		
		System.out.println(domain);
		
		
		
	}
	

}
