package weeklyMeeting.GroupStudies.tryCatch;

public class tryCatchFinally {

    public static void main(String[] args) {

        //try block can handle any checked and unchecked exceptions
        // cannot be used alone. Must be followed by either catch or finally
        //Catch Block where we handle the exception. It can not be used alone, must be used after try block
        //If we declare an incorrect exception in the catch block, then catch block will not be executed


        System.out.println("test1 started");

        int [] myArray ={1,2,3};
        try {
            System.out.println(myArray[5]); //execution stops here without try and catch
            System.out.println("inside try block");
        }catch (ArrayIndexOutOfBoundsException e){ ////Since we handled the exception, code execution will not stop
            e.printStackTrace();
            System.out.println("inside catch block");
        }
        System.out.println("test1 ended");


        /*We can use multiple catch blocks
        If there is inheritance relationship between the exception classes, then we should
        handle more specialized exception classes before more general exception classes*/

        System.out.println("test2 started");
        String str = "name";

        try {
            System.out.println(str.charAt(11));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("test2 ended");


        //==================================================
        /*Finally Block is always executed whether exception is handled or not */
        //Finally block is not executed only if JVM crashes during the code execution if we use → System.exit(0);

        System.out.println("test3 started");

        try {
            System.out.println(9/0);
            System.out.println("inside try");
        }catch (ArithmeticException e){
            System.out.println("inside catch");
           // System.exit(1);
        }finally {
            System.out.println("inside finally");
        }



    }
}
