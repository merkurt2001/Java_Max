package Reviews.EU6_review.week9;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		String password = new Scanner(System.in).nextLine();
		
		String letters = "";  
		String digits = "";  
		String specialChars = "";  
		
		
		for(int i =0; i <= password.length()-1; i++) {
			char ch = password.charAt(i);
			
			if(ch >= '0' && ch <= '9') { // if the character is digit
				digits += ch;
			}else if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <='Z')) { // if the character is a letter
				letters += ch;
			}else { // if the character is a special character
				specialChars += ch;
			}
		
		}
		
		
		boolean r1 = password.length() >= 8 && !password.contains(" ");
		boolean r2 = !letters.isEmpty();
		boolean r3 = !specialChars.isEmpty();
		boolean r4 = !digits.isEmpty();
		
		
		boolean isStrongPassword = r1 && r2 && r3 && r4;
		
		if(isStrongPassword) {
			
			System.out.println(password+" is strong password");
			
		}else {
			if(!r1) {
				System.err.println("Password must be at least have 8 characters long, and should not contain space");
			}
			
			if(!r2) {
				System.err.println("Password should at least contain one letter ");
			}
			
			if(!r3) {
				System.err.println("Password should at least contain one special characters");
			}
			
			if(!r4) {
				System.err.println("Password should at least contain a digit");
			}
			
		}
		
		

	}

}

/*
PasswordValidation:
Write a program that can verify if a password is a strong password. 
	Characteristics of strong passwords are:
            1. Password MUST be at least have 8 characters long, and should not contain space
            2. PassWord should at least contain one letter 
            3. Password should at least contain one special characters
            4. Password should at least contain a digit
*/