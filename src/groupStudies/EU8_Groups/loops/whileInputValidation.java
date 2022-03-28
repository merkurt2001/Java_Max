package groupStudies.EU8_Groups.loops;


import java.util.Scanner;

public class whileInputValidation {
    public static void main(String[] args) {
        /** --> WHILE LOOP for input validation- to be ensure that user input is valid
         * Ask user to enter a positive number. Print the next three numbers.
         * if the user enter invalid data ask again.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = sc.nextInt();

        while (number < 0) { //
            System.out.println("Enter a positive number: ");
            number = sc.nextInt();
        }

        //print next three numbers
        System.out.println("The next three numbers are: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(number + i);
        }

        System.out.println();

        for (int i = 0; i++ < 3; System.out.print(number++)) ;


    }
}
