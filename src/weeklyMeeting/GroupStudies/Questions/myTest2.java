package weeklyMeeting.GroupStudies.Questions;

public class myTest2 {
    int z;
    public static void main(String[] args) {
        myTest2 myTest = new myTest2();
        int z = 6;
        System.out.println(z);
        myTest.doStuff();
        System.out.println(z);
        System.out.println(myTest.z);
    }
    void doStuff() {
        int z = 5;
        doStuff2();
        System.out.println(z);

    }
    void doStuff2() {
        z = 4;

    }
}
