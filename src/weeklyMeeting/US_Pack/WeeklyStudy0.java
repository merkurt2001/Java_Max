package weeklyMeeting.US_Pack;

import java.util.Scanner;

public class WeeklyStudy0 {


    public static void main(String[] args) {

        /** WHILE LOOP for Counter-Controlled
         * Write a program for the following logic: Print all the odd numbers in
         * comma-separated form from 1 till the end (you may change it):
         * if end = 10, * OUTPUT = 1, 3, 5, 7, 9
         * if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
         *
         * You should use while loop and if-else statements. Note that, there should not
         * be any comma after the last digit.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive number");
        int number = input.nextInt();
        int i = 1 ;

        while (number<0){ //while loop usage for input validation
            System.out.println("please enter a positive number");
            number = input.nextInt();
        }

        while(i <= number){ // while loop usage for counter control

            System.out.print(i);
            i += 2;
            if (i <= number){
                System.out.print(",");
            }

        }


    }
}