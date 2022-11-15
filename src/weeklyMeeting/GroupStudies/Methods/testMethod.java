package weeklyMeeting.GroupStudies.Methods;

public class testMethod {

    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.print(" " + var1);
    }

    public static int doCalc(int var1) {

        var1 = var1 * 2;
        return var1;

    }
}
