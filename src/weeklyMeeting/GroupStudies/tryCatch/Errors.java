package weeklyMeeting.GroupStudies.tryCatch;

public class Errors {


    public static void main(String[] args) {
        System.out.println("test begins");

        //Errors indicates a very serious events..
        //We may handle some errors using try-catch blocks but not recommended
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            e.printStackTrace();
        }

        System.out.println("test ends");
    }

    private static void recursiveMethod() {
        recursiveMethod();
    }
}
