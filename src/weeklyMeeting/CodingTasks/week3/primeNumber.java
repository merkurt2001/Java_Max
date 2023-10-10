package weeklyMeeting.CodingTasks.week3;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not
     */
     public static void main(String[] args) {
         System.out.println(primeNumber(71));

     }

    public static boolean primeNumber(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
