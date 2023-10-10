package weeklyMeeting.GroupStudies.ArrayList;

public class varArgs {

    public static void main(String[] args) {

        sum(2,4);
        sum(2,3,5,6);
        sum(5,10,50);


    }

    public static void sum(int... numbers) {
        int sum = 0;

        for (int value : numbers) {
            sum = sum + value;

        }
        System.out.println(sum);
    }
}
