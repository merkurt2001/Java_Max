package weeklyMeeting.GroupStudies.loops;

public class whileExample5 {

    public static void main(String[] args) {
        int x = 0;
        int y = 2;

        while ((y != 0) && (x / y) >= 0) {
            x = x + 1;
            y = y - 1;

        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
