package weeklyMeeting.GroupStudies.SwitchStatement;

public class switchExample4 {

    public static void main(String[] args) {

        final char BLGR_A = 'a';
        final char BLGR_B = 'b';
        final char BLGR_O = 'o';


        char bloodgroup = 'a';

        switch (bloodgroup) {
            case BLGR_A:
                System.out.print("A");
            case BLGR_B:
                System.out.print("B");
            case BLGR_O:
                System.out.print("O");
                break;
        }//ABO
    }
}
