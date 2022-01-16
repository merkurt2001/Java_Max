package groupStudies.EU7_Groups.Strings;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

//		        (Check password) Some websites impose certain rules for passwords. Write a
//		        method that checks whether a string is a valid password. Suppose the password
//		        rules are as follows:
//		        ■ A password must have at least eight characters.
//		        ■ A password consists of only letters and digits.
//		        ■ A password must contain at least two digits.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter password: ");
		String password = scan.next();
		isPassValid(password);
	}

	private static void isPassValid(String password) {

		if ((password.length() < 8) || hasOtherChars(password) || !has2digits(password)) {
			// A password must have at least eight characters.
			System.out.println("Invalid password");
		} else {
			System.out.println("Valid password");
		}
	}

	private static boolean hasOtherChars(String password) {
		{
			// A password consists of only letters and digits
			for (int i = 0; i < password.length(); i++) {
				char c = password.toLowerCase().charAt(i);
				// checking if the char is letter
				if (c < 48 || (c > 57 && c < 97) || c > 122) {
					return true;
				}
			}
			return false;
		}

	}

	private static boolean has2digits(String password) {
		{
			int digitNumbers = 0;
			// A password consists of only letters and digits
			for (int i = 0; i < password.length(); i++) {
				char c = password.toLowerCase().charAt(i);
				// checking if the char is letter
				if (c >= 48 && c <= 57) {
					digitNumbers++;
				}
			}
			return (digitNumbers >= 2);
		}

	}

}
