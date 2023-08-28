package weeklyMeeting.GroupStudies.SwitchStatement;

public class switchExample3 {

    public static void main(String[] args) {

        final int ON = 1;
        final int OFF = 0;

        int state = 3;

        switch(state){
            case ON:
                System.out.print("On");
                break;

            default:
                System.out.print("Unknown");

            case OFF:
                System.out.print("Off");
        }//UnknownOff
    }
}
