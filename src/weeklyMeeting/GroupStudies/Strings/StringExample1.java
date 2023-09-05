package weeklyMeeting.GroupStudies.Strings;

/**
 * @author me
 */
public class StringExample1 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");
        String str5 = "java";
        String str6 = "Ja";
        String str7 = str6 + "va";

        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false, different memory location
        System.out.println(str1.equals(str3)); //true, different obj but same visible text
        System.out.println(str3.equals(str4)); //true, different obj but same visible text
        System.out.println(str1 == str5); //false, case sensitive
        System.out.println(str1.equals(str5)); //false, case sensitive
        System.out.println(str1.equalsIgnoreCase(str5)); //true, ignores case sensitivity
        System.out.println(str7);//Java
        System.out.println(str1 == str7); // false, created with String concatenation
        System.out.println(str1.equals(str7));
        System.out.println(str1.hashCode());
        System.out.println(str7.hashCode());


        // Using hashCode() - These will be equal because content is the same.
        int hashCode_str1 = str1.hashCode();
        int hashCode_str7 = str7.hashCode();

        // Using System.identityHashCode() - These will be different because they are different instances.
        int identityHashCode_str1 = System.identityHashCode(str1);
        int identityHashCode_str7 = System.identityHashCode(str7);


        if (hashCode_str1 == hashCode_str7) {
            System.out.println("Values Same");
            if (identityHashCode_str1 == identityHashCode_str7) {
                System.out.println("also the same object");
            } else {
                System.out.println("but different objects");
            }
        } else {
            System.out.println("Not same value and same object");
        }


        System.out.println("======================================");


        String a = "ab";
        String b = a + "cd";
        String c = "abcd";
        System.out.println(b);
        System.out.println(c);
        System.out.println(b == c);////false since d is created by string manipulation, not with
        // string literal so they are not the same obj

        System.out.println("======================================");
        //what is mutability

        StringBuilder str8 = new StringBuilder("hello");
        System.out.println(System.identityHashCode(str8));
        str8.append(" world"); //the same object
        System.out.println(str8);
        System.out.println(System.identityHashCode(str8));
        System.out.println(str8);

        String str9 = "hello";
        System.out.println(System.identityHashCode(str9));
        str9 = str9.concat(" world"); //actually we are creating a new object here
        System.out.println(str9);
        System.out.println(System.identityHashCode(str9));


        System.out.println("======================================");
        String str10 = "abc";
        String str11 = "abc";

        System.out.println("the result is : " + str10 == str11); //false, string concatenation creates a new string

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
