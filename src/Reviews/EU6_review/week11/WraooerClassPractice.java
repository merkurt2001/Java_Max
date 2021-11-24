package Reviews.EU6_review.week11;

public class WraooerClassPractice {
	
	public static void main(String[] args) {
		
		int b1 = 100;
		
		//Byte b2 = b1;
		Long l1 = (long)b1;
		
		
		Long l2 = 1000l;
		
		double d1 = l2;
		Double d2 = (double)l2;
		
		System.out.println("---------------------------------------");
		
		int i1 = 100;
		Integer i2 = i1; // Auto-boxing
		//Long i3 =  i1; 
		
		Integer n1 = 300;
		int n2 = n1; //unboxing
		long n3 = n1;
		float n4 = n1;
		double n5 = n1;
		
		System.out.println("-----------------------------------------");
		
		String str1 = "123";
		
		System.out.println(str1 + 1); // 1231
		
		int num = Integer.parseInt(str1); // int==> 123
		Integer num2 = Integer.valueOf(str1); // Integer ==> 123
		
		Integer num3 = Integer.parseInt(str1);  // auto-boxing
		int num4 = Integer.valueOf(str1);  // un-boxing
		
		System.out.println(num + 1);
		
		String str2 = "123abc";
		
		// System.out.println(  Integer.parseInt(str2) + 1  );
		
		String str3 = "0.05";
		double a1 = Double.valueOf(str3);
		
		System.out.println(a1 + 1);
		
		System.out.println("---------------------------------------------");
		// Character: isDigit(), isLetter(), isLowerCase(), isLetterOrDigit()
		char ch = '&';
		
		boolean isDigit = Character.isDigit(ch);
		boolean isLetter = Character.isLetter(ch);
		boolean isLowerCaseLetter = Character.isLowerCase(ch);
		boolean isUpperCaseLetter = Character.isUpperCase(ch);
		// special char: !, @, #, , . ? :, ; { ...
		boolean isSpecialChar = ! Character.isLetterOrDigit(ch); 
				// if the character is not letter and not a digit, then it's a special character
		
		System.out.println(isDigit);
		System.out.println(isLetter);
		System.out.println(isLowerCaseLetter);
		System.out.println(isUpperCaseLetter);
		System.out.println(isSpecialChar);
		
		System.out.println("---------------------------------------");
		String s1 = "a1b2c3";
		
		int sumOfDigits = 0; // 6
		
		for(char each :  s1.toCharArray() ) {
			if(Character.isDigit(each)) { //'1', '2', '3'
				sumOfDigits +=  Integer.parseInt(""+each);
			}
		}
		
		System.out.println(sumOfDigits);
		
		System.out.println("--------------------------------------");
		
		String s = "abcd1234!@#$efghi6789#$%^ABCD";
		
		String letters = "";
		String upperCaseLetters = "";
		String lowerCaseLetter = "";
		String digits = "";
		String specialChars = "";
		
		 for(char each :s.toCharArray() ) {
			 
			 if(Character.isLetter(each)) {
				 letters += each;
				 if(Character.isUpperCase(each)) {
					 upperCaseLetters += each;
				 }else {
					 lowerCaseLetter += each;
				 }
				 
			 }else if(Character.isDigit(each)) {
				 digits += each;
			 }else {
				 specialChars += each;
			 } 
			
		 }
		 
		 System.out.println(letters);
		 System.out.println(upperCaseLetters);
		 System.out.println(lowerCaseLetter);
		 System.out.println(digits);
		 System.out.println(specialChars);
		
		
		
		
	
		
		
	}

}
