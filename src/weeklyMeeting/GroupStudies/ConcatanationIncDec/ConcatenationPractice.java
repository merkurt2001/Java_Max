package weeklyMeeting.GroupStudies.ConcatanationIncDec;

import java.text.DecimalFormat;

public class ConcatenationPractice {
    public static void main(String[] args) {
//        concatenations vs addition
//        String + String -> concatenation
        System.out.println("*****************************************************************************");
        String str1 = "Precious ";
        String str2 = "Team";
        System.out.println(str1 + str2);//Precious Team
        System.out.println("This is my " + str1 + str2); //This is my Precious Team

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
        System.out.println(str1 + ch);//Precious R
        System.out.println(ch + str1);//RPrecious
        System.out.println(str1+n);//Precious 109
        System.out.println(n+str1);//109Precious

        System.out.println("*****************************************************************************");

//        number + number -> addition
        int num2 = 55;
        int num3 = 21;
        float f1 = 12;
        float f2 = 5.00F;
        double d1 = 41;
        double d2 = 44.00;
        System.out.println(num2 + num3);//76
        System.out.println(num3 + f1);//33.0
        System.out.println(num3 + f2);//26.0
        System.out.println(d1 + f2);//46.0
        System.out.println(d1 + d2);// 85.0
        System.out.println(3 + 3.0);//  6.0
        System.out.println(3 + 3.00);//6.0
        System.out.println(num2 + 11.005);// 66.005

        System.out.println("*****************************************************************************");
        //Second Approach
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(num2 + 11.005));//66.00

        //Third Approach printf method
        System.out.printf("%.2f", num2 + 11.0005);//66.00
        System.out.println();

        //Forth Approach String Formatter
        System.out.println(String.format("%.2f", num2 + 11.006)); //66.01

        System.out.println("*****************************************************************************");

//        char + char -> addition
        char ch1 = 'A';
        System.out.println(ch1);//A
        char ch2 = 67;
        System.out.println(ch2);//C
        int ch3 = 't';
        System.out.println(ch3);//116
        char ch4 = 'b';
        System.out.println(ch4);//b
        System.out.println("--------------------------------------------");
        System.out.println(ch1 + ch2);//132
        System.out.println(ch2 + ch3);//183
        System.out.println(ch3 + ch4);//214
        System.out.println(ch1 + ch4);//163
        System.out.println("--------------------------------------------");
        System.out.println("String at the beginning " + ch1 + ch2);//String at the beginning AC
        System.out.println(ch2 + ch3 + " String at the end");//183 String at the end
        System.out.println(str1 + ch2 + ch3 + " String at the beginning and at the end");//Precious C116 String at the beginning and at the end
        System.out.println(ch3 + " String in the middle " + ch4);//116 String in the middle b
        System.out.println(ch1 + "" + ch4);//Ab


    }
}
