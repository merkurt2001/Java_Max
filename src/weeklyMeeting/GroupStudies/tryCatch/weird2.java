package weeklyMeeting.GroupStudies.tryCatch;

public class weird2 {
    public static void main(String[] args) {
        int answer;

        try {
            int num = 10;
            int div = 0;
            answer = num / div;
        } catch (ArithmeticException e) {
            answer = 0;
        } catch (Exception e1) {
            System.out.println("Invalid calculation");

        }

        //System.out.println("Answer = " + answer);
    }
}
