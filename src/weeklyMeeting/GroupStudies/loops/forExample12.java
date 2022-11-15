package weeklyMeeting.GroupStudies.loops;

public class forExample12 {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if (i % 3 == 0)
                continue;
            System.out.print(i);
        }
    }
}
