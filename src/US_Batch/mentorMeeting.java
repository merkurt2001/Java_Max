package US_Batch;

public class mentorMeeting {

    public static void main(String[] args) {

        int num = -12;

       String numAsStr = String.valueOf(num);
       String [] strSplit = numAsStr.split("");

       String result ="";

        for (int i = strSplit.length - 1; i > 0; i--) {
            result += strSplit[i];
        }
        System.out.println(result);



    }
}
