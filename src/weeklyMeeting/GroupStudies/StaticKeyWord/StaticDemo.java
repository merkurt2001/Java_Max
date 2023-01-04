package weeklyMeeting.GroupStudies.StaticKeyWord;

public class StaticDemo {

    static String n1 = examName("O");

    {
        n1= examName("A");
    }
    static {
        n1 = examName("C");
    }

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
    }

    public static String examName(String s) {
        System.out.println(s);
        return s;
    }
}
