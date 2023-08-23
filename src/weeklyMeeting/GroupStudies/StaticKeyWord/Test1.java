package weeklyMeeting.GroupStudies.StaticKeyWord;

class Test1 {
    static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {

        Test1 check1 = new Test1();
        Test1 check2 = new Test1();

        check1.changeCount();
        check2.changeCount();

        System.out.println(check1.count + " " + check2.count); //10 10

    }
}
