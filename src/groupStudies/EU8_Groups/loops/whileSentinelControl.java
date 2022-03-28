package groupStudies.EU8_Groups.loops;

import java.util.Scanner;

public class whileSentinelControl {
    public static void main(String[] args) {
        /**
         * What happens if we don’t know how many times a loop will run.
         * –Also called signal value, dummy value, or flag value
         * –Indicates “end of data entry.”
         * –Loop ends when user inputs the sentinel value
         * –Sentinel value chosen so it cannot be confused with a regular input
         *
         * Develop a class-averaging program that will process an arbitrary number of grades each time the program is run.
         */
        int grade, total, counter;
        total = 0;
        counter = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade, -1 to end");
        grade = scanner.nextInt();

        while (grade != -1) {
            total = total + grade;
            counter++;
            System.out.println("Enter grade, -1 to end");
            grade = scanner.nextInt();

        }
        System.out.println("Average is " + (total / counter));



    }
}
