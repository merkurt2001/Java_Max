package weeklyMeeting.GroupStudies.tryCatch;

public class exceptionHandling {
    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("pants");
            return;
        }catch (NumberFormatException nfe){
            System.out.println("inside catch block");
        }finally {
            System.out.println("in the finally block");
        }
        System.out.println("end here");
    }
}
