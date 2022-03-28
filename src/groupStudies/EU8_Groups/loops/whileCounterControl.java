package groupStudies.EU8_Groups.loops;

import java.util.Scanner;

public class whileCounterControl {
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

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a positive number");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i);
            i += 2;
            if (i <= n) {
                System.out.print(",");
            }

        }
    }
}


