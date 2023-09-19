package weeklyMeeting.GroupStudies.tryCatch;

public class weird {
    public static void main(String[] args) {
        System.out.println(printNumber());
    }

    private static int printNumber() {
        try{
            System.out.println("inside try1");
            return 3;
        }catch (Exception e){
            System.out.println("inside catch");
            return 4;
        }finally {
            System.out.println("inside finally");
            return 5;
        }
    }
}
