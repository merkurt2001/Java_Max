package weeklyMeeting.GroupStudies.loops;

public class forExample1 {

    public static void main(String[] args) {

        boolean flag = true;

        for (int i = 0; i <= 5; i++) {

            if (flag == true) {
                System.out.print(i + " ");

            }
            flag = !flag;

        }
    }
}
