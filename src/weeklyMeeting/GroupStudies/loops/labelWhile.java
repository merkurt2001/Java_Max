package weeklyMeeting.GroupStudies.loops;

public class labelWhile {

    public static void main(String[] args) {

        int i = 0;
        outer:
        while (i < 10) {
            i += 2;
            int j = 10;
            inner:
            while (j > 0) {
                j -= 2;
                if (i == j)
                    break outer;
                System.out.print(i + " " + j + ", ");


            }
        }
    }
}
