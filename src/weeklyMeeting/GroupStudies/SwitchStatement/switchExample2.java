package weeklyMeeting.GroupStudies.SwitchStatement;

public class switchExample2 {

    public static void main(String[] args) {
        final int ON = 1;
        final int OFF = 0;
        int state = 1;

        switch (state) {
            case ON:
                System.out.println("On");
                break;
            default:
                System.out.println("Unknown");
            case OFF:
                System.out.println("Off");

        }//On
    }
}
