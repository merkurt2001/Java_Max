package weeklyMeeting.GroupStudies.Variables;

public class Variables {

    public static void main(String[] args) {

        int num; //declaration
        num = 10; //initiliaziton

//        String num = "hello"; // we can not declare more than one variable name with the same name

        num = 20; //but we may assign a new value

        int num2 = 30; //declaration and initialization at the same line

        int num3;
        //System.out.println(num3); //for primitive data type we have to initialize before use it

        long l = (long) 43; //default value for whole number is integer
        long l1 = 44444444444L; //Long data  type may require additional L at the end

//        float f = 44.5; //compiler error - default type for decimal number is double
        float f2 = 44.3f;//we have to add additioanl f at the end.

        System.out.println("identifier rules :");

        int count; //a letter between ( A - Z ) or ( a - z )
        int _count; //or underscore ( _ )
        int $count; //or dollar sign ( $ )

//        int 12count; --compiler error
//        int &count; -- compiler error

        int v_ariable;          //  any letter ( A - Z ) or ( a - z )
        int v12ariable25;        //  digits ( 0 - 9 ) , underscore ( _ )
        int V$ariableX1;         //  dollar sign ( $ )
        int vAriable;            //

        //int va riable;           //  ✗ !!! COMPILE ERROR !!! Space is not allowed
        //int va**riable;          //  ✗ !!! COMPILE ERROR !!! No special character is allowed other than underscore ( _ ) and dollar sign ( $ )
        //int v-ar!iable;          //  ✗ !!! COMPILE ERROR !!!

        //we should use camelCase to make variables names more readable
        String firstName;
        long phoneNumber;

        //final key word
        final double PI = 3.14; //final variable can not be changed
//        PI = 2,34; -- COMPILER ERROR

    }
}
