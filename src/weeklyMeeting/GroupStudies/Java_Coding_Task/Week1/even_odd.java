package weeklyMeeting.GroupStudies.Java_Coding_Task.Week1;

public class even_odd {
    /*Write  a method which can identifies given number is even or odd
    EX:
    identify(5) ->  "Odd"
    identify(6) ->  "Even"*/

    public static void main(String[] args) {

        System.out.println(identify(6));


    }

    public static String identify(int num) {
        if (num%2==0)
            return "Even";
        return "Odd";

        //return  i%2==0 ? "even" : "odd" ;
    }

}
