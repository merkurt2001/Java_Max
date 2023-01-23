package weeklyMeeting.US_Pack;

import java.util.Arrays;

public class Task2 {
    /*Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("
abc abb "); -->*/
    public static void main(String[] args) {

        System.out.println("same(\"abca\", \"bca\") = " + same("abca", "bca"));

    }

    private static boolean same(String a, String b) {

        char[] left = a.toCharArray();
        char[] right = b.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left, right);
    }


}
