package weeklyMeeting.GroupStudies.ConcatanationIncDec;

public class Concatanation {
    public static void main(String[] args) {
        //concatanation and addition
        String str1 = "Precious ";
        String str2 = "Team";
        System.out.println(str1 + str2); //String +  String = concatenation

        int number = 12;

        System.out.println(str1 + str2 + " has " + number + " students"); //String + number = concatenation

        char ch = 'M';

        System.out.println(str1 + ch); //String + char = concatenation

        int number1 = 1;

        System.out.println(number + number1); //number + number = addition

        char ch1 = 'N';
        System.out.println(ch + ch1); //char + char = addition
        System.out.println(ch + number); //char + number = addition

        System.out.println("String at the beginning " + ch + ch1); //String at the beginning MN
        System.out.println(ch + ch1 + " String at the end "); //219 String at the end
        System.out.println(ch + " String in the middle " + ch1); //M String in the middle N
        System.out.println(ch + "" + ch1);//MN

        System.out.println(1 + 25 + 2 + "aws"); //28aws
        System.out.println(1 + "aws" + (2 + 4)); //1aws6
        System.out.println("aws" + 1 + 2 + 3); //aws123
        System.out.println('a' + 'w' + 's'); //331
        System.out.println('w' + " " + 's'); //w s
        System.out.println('a' + "" + 's'); //as
        System.out.println('w' + 's'); //234
        System.out.println('w');//w

    }
}
