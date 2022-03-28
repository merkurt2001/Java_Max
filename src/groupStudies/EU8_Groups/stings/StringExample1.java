package groupStudies.EU8_Groups.stings;


public class StringExample1 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");
        String str5 = "java";

        System.out.println(str1 == str3); //false--different memory location and object
        System.out.println(str1 == str2); //true-- the same object
        System.out.println(str1.equals(str3));//true--different object but same visible text
        System.out.println(str3.equals(str4));//true--different object but same visible text
        System.out.println(str1 == str5);//false-- case sensitive
        System.out.println(str1.equals(str5));//false- case sensitive
        System.out.println(str1.equalsIgnoreCase(str5));//true- ignores case sensitivity

        System.out.println("=============================");

        String str6 = "abc";
        String str7 = "abc";

        System.out.println("str1==str2 is :" + str6 == str7); // st1==str2 is :abc == abc--false

        System.out.println("=============================");
        String names = "jim ";
        String greeting = "hello " + names; //hello jim
        greeting += "good to see you"; //hello jim good to see you
        System.out.println(greeting);

        System.out.println("=============================");

        // Immutability of string
//    concat()-- combines specified string at the end of the string.

        String str = "Cydeo";

        str.concat(" School"); //Cydeo School

        System.out.println(str); //Cydeo

        str = str.concat(" School"); //Cydeo School

        System.out.println(str); //Cydeo School

        System.out.println("-----------------------------------");

        String s5 = "EU batch 8";
        s5.toUpperCase(); //EU BATCH 8

        System.out.println(s5); //EU batch 8

        s5 = s5.toUpperCase(); //EU BATCH 8

        System.out.println(s5); //EU BATCH 8

        System.out.println("=============================");

        String ta = "A"; //A
        ta = ta.concat("B"); //AB
        String tb = "C"; //tb= C
        ta = ta + tb; //ABC
        ta.replace('C', 'D'); //ABD NOT ASSIGN
        ta = ta + tb; //ABCC
        System.out.println(ta); //ABCC


    }
}
