package weeklyMeeting.GroupStudies.loops;

public class whileExample3 {

    public static void main(String[] args) {

        int x = -4;

        while (x < 0) {

            x++;
            if (x == -1) {
                break;
            }

            System.out.println(x);

        }
    }
}
