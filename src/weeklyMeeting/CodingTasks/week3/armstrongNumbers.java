package weeklyMeeting.CodingTasks.week3;

public class armstrongNumbers {
    /*
    Write a method that can check if a number is Armstrong number
     */
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));//1^3+5^3 + 3^3=153  //1+125+27=153
    }
    public static boolean isArmStrongNumber(int num) {
        int remainder = 0, result = 0, originalNumber = num;

        while (num > 0) {
            remainder = num % 10;  //a=3     //a=5   //a=1
            //result = result + (remainder * remainder * remainder);//b=0+(3*3*3)=27 //b=27+(5*5*5)=152 //b=152+(1*1*1)=153
            result += Math.pow(remainder, 3);
            num /= 10;     //num=15 //num=1 //num=0
        }

        return originalNumber == result; //153 == 153
    }

}
