package weeklyMeeting.GroupStudies.tryCatch;

public class Practice {

    public static void main(String[] args) {


        //code 1;                       Q1 There is no error/exception in the code = All of them except catch block: code 1234789
        //code 2;                       Q2 Code 1 has error/exception = Nothing is executed

        try{
            //code 3;                   Q3 Code 3 has error/exception = code 1256789
            //code 4;
        }catch(Exception e) {
            //code 5;                   Q4 Code 5 has error/exception = All of them except catch block: code 1234789
            //code 6;                   Q5 Code 4 and code 5 have error/exception = code 12378 and execution will stop
        }finally {
            //code 7;                   Q6 Code 7 has error/exception = code 1234 and execution will stop
            //code 8;
        }

        //code 9;




    }

}
