package weeklyMeeting.GroupStudies.Java_Coding_Task.Week1;

public class divideW {
    public static void main(String[] args) {
        divide(31, -3);

    }

    public static void divide(int dividend, int divisor) {
        // Edge case: if divisor is 0, return 0
        if (divisor == 0) {
            System.out.println("divisor can not be 0");
            return;
        }

        // Initialize result to 0 and sign to 1
        int result = 0;
        int sign = 1;

        // If either dividend or divisor is negative, change the sign
        if (dividend < 0 || divisor < 0) {
            sign = -1;
        }

        System.out.print(dividend + " devid by " + divisor + " is: ");

        // Take the absolute value of the dividend and divisor
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Iterate until the dividend is less than the divisor
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }
        System.out.println(sign * result);
        System.out.println("remainder is :" + dividend);


    }
}
