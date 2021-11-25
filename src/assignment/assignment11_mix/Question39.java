package assignment.assignment11_mix;

public class Question39 {

	public static void main(String[] args) {
		
		String email = "info@cybertekschool.com";
		String emailID ="";
		String emailDomain ="";
		
		int count = 0;
		for(int i=0;i<email.length();i++) {
			if(email.substring(i, i+1).equals("@")) {
				count++;
			}
		}
			
		
		if(count==0 || count>1) {
			
			System.out.println("invalid email");
			
		}else {
			
			String[] arr = email.split("@");
			
			emailID = arr[0];
			emailDomain = arr[1];
			
			System.out.println("Email id : " + emailID);
			System.out.println("Email domain : " + emailDomain);
			
		}
		


	}

}
