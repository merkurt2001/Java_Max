package weeklyMeeting.GroupStudies.package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your firstname");
        String firstname = scanner.next(); // to get just one word ---Mike

        System.out.println("Please enter your lastname");
        String lastname = scanner.next(); //smith + enter

        scanner.nextLine();

        System.out.println("Please enter your address");
        String address = scanner.nextLine(); //enter

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        System.out.println("What is pi?");
        double pi = scanner.nextDouble();

        DecimalFormat dc = new DecimalFormat("0.00");

        System.out.println(dc.format(pi));

        System.out.println("Please enter your gender as F or M");
        char gender = scanner.next().charAt(0);

        if (gender == 'F') {
            System.out.println("Female");
        } else if (gender == 'M') {
            System.out.println("Male");
        } else {
            System.out.println("invalid data");
        }


    }

}
