package groupStudies.EU6_Groups.package3;

/**
 * @author me
 *
 */
public class StringExpressions {


	public static void main(String[] args) {
		
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
//			     index 0123456789012345
		
		System.out.println(str1.length()); // 13
		System.out.println(str1.charAt(7)); // a
		System.out.println(str2.charAt(0)); // G
		System.out.println(str1.indexOf("o")); // 2
		System.out.println(str1.toLowerCase().indexOf("B")); // -1
		System.out.println(str1.substring(4)); // o Baggins
		System.out.println(str2.substring(3,14)); // dalf the GR
		System.out.println(str2.replace("a", "oo")); // Goondoolf the GRAY 
		System.out.println(str2.replace("gray", "white")); // Gandalf the GRAY
		System.out.println("str1".replace("r","range")); // strange1
	}

}
