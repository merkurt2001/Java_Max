package groupStudies.GroupStudies.Strings;

/**
 * @author me
 *
 */
public class StringExample1 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		String str4 = new String("Java");

		String s4 = "java";

		System.out.println(str1 == str3); //false, different memory locatin
		
		System.out.println(str1==str2); //true
		
		System.out.println(str1.equals(str3)); //true, different obj, same visible text

		System.out.println(str3.equals(str4));//true, different obj, same visible text

		System.out.println(str1 == s4);//false, case sensitive
		
		System.out.println(str1.equals(s4)); //false, case sensitive

		System.out.println(str1.equalsIgnoreCase(s4));//true, ignores case sensitivity

		System.out.println("=============================");

		String str5 = "abc";
		String str6 = "abc";

		System.out.println("str1==str2 is :" + str5 == str6); //false, st1==str2 :str1 == st2

		System.out.println("=============================");
		String names = "jim ";
		String greeting = "hello " + names;
		greeting += "good to see you";
		System.out.println(greeting); //hello jim good to see you

		System.out.println("=============================");

		// Immutability of string
//		concat()-- combines specified string at the end of the string.

		String str = "Cydeo";

		str.concat(" School"); //Cydeo School

		System.out.println(str); //Cydeo

		str = str.concat(" School"); 

		System.out.println(str);//Cydeo School

		System.out.println("-----------------------------------");

		String s5 = "EU batch 8";
		s5.toUpperCase(); //EU BATCH 7

		System.out.println(s5); //EU batch 7

		s5 = s5.toUpperCase();

		System.out.println(s5);//EU BATCH 7

		System.out.println("=============================");

		String ta = "A";
		ta = ta.concat("B"); //AB
		String tb = "C";//C
		ta = ta + tb;//ABC
		ta.replace('C', 'D');//
		ta = ta + tb; //ABCC
		System.out.println(ta); //ABCC

	}

}
