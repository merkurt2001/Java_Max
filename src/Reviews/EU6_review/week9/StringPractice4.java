package Reviews.EU6_review.week9;

public class StringPractice4 {
	
	public static void main(String[] args) {
		String first = "DANiel";
		
		first = first.substring(0, 1).toUpperCase()  + first.substring(1).toLowerCase();
			   //                 C                  +    ybertek                        ==> "Cybertek"
		
		String last = "JoshuA";
		
		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
		//           S                    + shool                ==> "School"
		
		
		String fullName = first+" "+last;
		
		System.out.println(fullName);
		
		System.out.println("--------------------------------------------------------");
		
		String str = "A1B2C3";
		//			  012345
		
		// 1+2+3 = 6
		
		int sum = 0;
		
		for(int i=0; i <= str.length()-1; i++) { // i represents index numbers of str
			char ch = str.charAt(i); //
			if(ch >= '0' && ch <= '9') { // to verify if the character is digit
				sum +=   ch - '0'; // converting the digit characters to number
			}
			
		}
		
		
		System.out.println(sum);
		
		
		System.out.println("------------------------------------------------");
		
		String input = "Cybertek12345School789!@#$%^&";
		
		String letters = "";  //mnjklABCD
		String digits = "";  //12345
		String specialChars = "";  //@#!
		
		
		for(int i =0; i <= input.length()-1; i++) {
			char ch = input.charAt(i);
			
			if(ch >= '0' && ch <= '9') { // if the character is digit
				digits += ch;
			}else if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <='Z')) { // if the character is a letter
				letters += ch;
			}else { // if the character is a special character
				specialChars += ch;
			}
		
		}
		
		
		System.out.println("Digits: "+digits);
		System.out.println("Letters: "+letters);
		System.out.println("Special Chars: "+specialChars);
		
		
		
		
		
		
		
		
	}

}
