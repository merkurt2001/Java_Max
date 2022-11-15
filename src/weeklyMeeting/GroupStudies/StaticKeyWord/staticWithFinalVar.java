package weeklyMeeting.GroupStudies.StaticKeyWord;

class Demo{
    static {
        System.out.println("coming from static");
    }

    public static final int x = 20; //with the final var class wont load and static blok do not execute
}

public class staticWithFinalVar {

        public static void main(String[] args) {
            System.out.println(Demo.x);
        }

}
