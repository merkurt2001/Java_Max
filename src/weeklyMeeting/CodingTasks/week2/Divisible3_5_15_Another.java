package weeklyMeeting.CodingTasks.week2;

import java.util.Scanner;

public class Divisible3_5_15_Another {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";


        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 15 == 0) {
                    divisibleBy15 += i + " ";
                } else if (i % 5 == 0) {
                    divisibleBy5 += i + " ";
                } else if (i % 3 == 0) {
                    divisibleBy3 += i + " ";
                }


            }

        }
        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);
    }

}
