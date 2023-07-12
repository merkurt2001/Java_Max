package weeklyMeeting.GroupStudies.Strings;

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
		String str5 = "java";

		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false, different memory location
		System.out.println(str1.equals(str3)); //true, different obj but same visible text
		System.out.println(str3.equals(str4)); //true, different obj but same visible text
		System.out.println(str1 == str5); //false, case sensitive
		System.out.println(str1.equals(str5));//false, case sensitive
		System.out.println(str1.equalsIgnoreCase(str5));//true, ignores case sensitivity

		System.out.println("======================================");
		//what is mutability

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(System.identityHashCode(sb));
		sb.append(" world"); //the same object
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);

		String sb1 = "hello";
		System.out.println(System.identityHashCode(sb1));
		sb1 = sb1.concat(" world"); //actually we are creating a new object here
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));


		System.out.println("======================================");
		String str6 = "abc";
		String str7 = "abc";

		System.out.println("the result is : " + str6 == str7); //false, string concatenation creates a new string

		System.out.println("======================================");

		String names = "jim ";
		String greeting = "hello " + names;
		greeting += "good to see you";
		System.out.println(greeting);

		System.out.println("=============================");


		String schoolName = "CYDEO";
		schoolName.concat(" SCHOOL");

		System.out.println(schoolName);

		schoolName = schoolName.concat(" School");

		System.out.println(schoolName);

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
