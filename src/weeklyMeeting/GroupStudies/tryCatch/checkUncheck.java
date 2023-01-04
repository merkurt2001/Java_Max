package weeklyMeeting.GroupStudies.tryCatch;

public class checkUncheck {
    //an exception is an unwanted event that disrupts the normal flow of the program.
    //The Exception Handling in Java is a mechanism to handle the runtime
    //errors so that normal flow of the application can be maintained
    public static void main(String[] args) {

        //int x = "abc"; //Compile time error out of Exception handling


        //Unchecked Exceptions: Compiler is NOT able to check
        //Unchecked exceptions that are NOT checked at compile time
        //Occurs during RUNTIME so hard to detect
        //Classes which inherits “RuntimeException” are unchecked exceptions

        System.out.println(10/0);//ArithemticException

        String str = null;
        System.out.println(str.length());//NullPointerException

        int[] array = {0,1,2};
        System.out.println(array[10]); //ArrayIndexOutOfBoundException

        String str1 = "hello";
        System.out.println(str.charAt(10)); //StringIndexOutOfBoundsException

        //==================================================
        //Checked Exceptions must be handled
        //Compiler is able to check
        //Checked exceptions that are checked at compile time
        //Occurs during COMPILE time
        //Code will NOT COMPILE if we do not handle them
        //all exception classes that are not child of runtime exception

        //Thread.sleep(3000); //exception occurs here and code will note compile

        //=============================================
        //Errors indicates a very serious events..
        //We may handle some errors using try-catch blocks but not recommended

        recursiveMethod();//error occurs here: StackOverflowError



    }

    private static void recursiveMethod() {
        recursiveMethod();
    }
}
