package weeklyMeeting.CodingTasks.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        divides(6,3);
        divides(4,2);
        divides(3,0);
        divides(0,2);

    }

    public static void divides(int num1, int num2) {
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }
/*This simulates the process of long division, where you repeatedly subtract the divisor (num2)
from the dividend (num1) until the dividend becomes less than the divisor.*/

}
