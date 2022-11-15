package weeklyMeeting.GroupStudies.loops;

public class deceptive1 {

    public static void main(String[] args) {
        /*
         * A Deceptive problem
         *
         * Write a for loop that displays numbers from 1 to 5, seperated by commas
         *
         * output should be like;
         *
         * 1,2,3,4,5
         */

        //first approach

        System.out.print(1);
        for (int i = 2; i <= 5; i++) {
            System.out.print(", " + i);

        }

        System.out.println();


        //second approach

        for (int i = 1; i <= 5 - 1; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(5);

        System.out.println();


        //third approach

        String comma = "";

        for (int i = 1; i <= 5; i++) {
            System.out.print(comma + i);
            comma = ", ";
        }
        System.out.println();



    }
}
