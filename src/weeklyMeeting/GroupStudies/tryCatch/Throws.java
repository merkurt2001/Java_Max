package weeklyMeeting.GroupStudies.tryCatch;

public class Throws {

    //throws keyword: can ONLY handle checked exceptions
    //It is used with methods and added to method signature
    //It informs the compiler that this method can throw an exception
    //the caller of the method will be responsible for handling the exception

    public static void main(String[] args) throws InterruptedException {
        sleepMethod(1);//Since sleepMethod() throws a checked exception, main method must handle it
    }
    //this method throws a checked exception, so it must be handled
    private static void sleepMethod(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);//checked exception
    }
}
