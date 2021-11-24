package groupStudies.EU6_Groups.package3;

public class StringExpression2 {

	public static void main(String[] args) {
		
		String str1 = "Q.E.D";
		String str2 = "Arcturan Megadonkey";
		String str3 = "Sirius Cybernetics Corporation";
//	     		 index 012345678901234567890123456789
		
		System.out.println(str1.substring(2,4)); // E.
		System.out.println(str2.substring(10,14)); // egad
		System.out.println(str1.indexOf("D")); // 4
		System.out.println(str1.indexOf(".")); // 1
		System.out.println(str2.indexOf("donkey")); // 13
		System.out.println(str3.indexOf("X")); // -1
		System.out.println(str2 + str3.charAt(17)); // Arcturan Megadonkeys
		System.out.println(str3.substring(9, str3.indexOf("e"))); // b
		System.out.println(str3.substring(7,12)); // Cyber
		System.out.println(str2.toLowerCase().substring(9,13) + str3.substring(18, str3.length()-7)); //mega Corp 

	}

}
