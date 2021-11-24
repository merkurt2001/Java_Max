package groupStudies.EU7_Groups.package6;

/**
 * @author me
 *
 */
public class StringExample1 {

	public static void main(String[] args) {

		String s1 = "Java";
		String st1 = "Java";
		String s2 = new String("Java");
		String s3 = new String("Java");

		String s4 = "java";

		System.out.println(s1 == s2); //false, different memory locatin
		
		System.out.println(s1==st1); //true
		
		System.out.println(s1.equals(s2)); //true, different obj, same visible text

		System.out.println(s2.equals(s3));//true, different obj, same visible text

		System.out.println(s1 == s4);//false, case sensitive
		
		System.out.println(s1.equals(s4)); //false, case sensitive

		System.out.println(s1.equalsIgnoreCase(s4));//true, ignores case sensitivity

		System.out.println("=============================");

		String str1 = "abc";
		String str2 = "abc";

		System.out.println("str1==str2 is :" + str1 == str2); //false, st1==str2 :str1 == st2

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

		String s5 = "EU batch 7";
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
