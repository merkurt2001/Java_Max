package weeklyMeeting.US_Pack;

public class WeeklyStudy2 {

    public static void main(String[] args) {

        /**
         * print out reverse of the given string
         */

        String str = "Java Programming Language Is Awesome Language";

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(""+str.charAt(i));
        }

        StringBuilder sb = new StringBuilder(str);
        System.out.println( sb.reverse());


    }
}
