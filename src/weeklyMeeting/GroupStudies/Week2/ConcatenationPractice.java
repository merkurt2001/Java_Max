package weeklyMeeting.GroupStudies.Week2;

import java.text.DecimalFormat;

public class ConcatenationPractice {
    public static void main(String[] args) {
//        concatenations vs addition
//        String + String -> concatenation
        System.out.println("*****************************************************************************");
        String str1 = "Precious ";
        String str2 = "Team";
        System.out.println(str1 + str2);
        System.out.println("This is my " + str1 + str2);

        System.out.println("*****************************************************************************");
//        String + number -> concatenation
        String str3 = "Team Number: ";
        int num1 = 5;
        System.out.println(str3 + num1);
        System.out.println(str3 + 7);
        System.out.println("Team Capacity: " + 37);

        System.out.println("*****************************************************************************");

//        String + char -> concatenation
        char ch = 'R';
        int n = 'm';
        System.out.println(str1 + ch);
        System.out.println(ch + str1);
        System.out.println(str1+n);
        System.out.println(n+str1);

        System.out.println("*****************************************************************************");

//        number + number -> addition
        int num2 = 55;
        int num3 = 21;
        float f1 = 12;
        float f2 = 5.00F;
        double d1 = 41;
        double d2 = 44.00;
        System.out.println(num2 + num3);
        System.out.println(num3 + f1);
        System.out.println(num3 + f2);
        System.out.println(d1 + f2);
        System.out.println(d1 + d2);
        System.out.println(3 + 3.0);
        System.out.println(3 + 3.00);
        System.out.println(num2 + 11.005);

        System.out.println("*****************************************************************************");
        //Second Approach
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(num2 + 11.005));

        //Third Approach printf method
        System.out.printf("%.2f", num2 + 11.0005);
        System.out.println();

        //Forth Approach String Formatter
        System.out.println(String.format("%.2f", num2 + 11.006));

        System.out.println("*****************************************************************************");

//        char + char -> addition
        char ch1 = 'A';
        System.out.println(ch1);
        char ch2 = 67;
        System.out.println(ch2);
        int ch3 = 't';
        System.out.println(ch3);
        char ch4 = 'b';
        System.out.println(ch4);
        System.out.println("--------------------------------------------");
        System.out.println(ch1 + ch2);
        System.out.println(ch2 + ch3);
        System.out.println(ch3 + ch4);
        System.out.println(ch1 + ch4);
        System.out.println("--------------------------------------------");
        System.out.println("String at the beginning " + ch1 + ch2);
        System.out.println(ch2 + ch3 + " String at the end");
        System.out.println(str1 + ch2 + ch3 + " String at the beginning and at the end");
        System.out.println(ch3 + " String in the middle " + ch4);
        System.out.println(ch1 + "" + ch4);


    }
}
