package weeklyMeeting.GroupStudies.SwitchStatement;

public class switchExample5 {

    public static void main(String[] args) {

        char c = 'd';
        switch (c) {
            case 'a':
                System.out.print("a");
            case 'b':
                System.out.print("b");
            case 'c':
                System.out.print("c");
            case 100:
                System.out.print("100");
            default:
                System.out.print("No match");//100No match
        }
    }
}
