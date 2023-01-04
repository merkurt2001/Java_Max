package weeklyMeeting.GroupStudies.Java_Coding_Task.Week1;

public class divideWithoutOpetator {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {
        devides(20, 3);

    }

    public static void devides(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }


        System.out.print(num1 + " devid by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }

}
