package weeklyMeeting.CodingTasks.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int

    public static void main(String[] args) {

        System.out.println(reverseNum(-53));
    }

    public static int reverseNum(int  num) {

//        String str = new StringBuilder(""+num).reverse().toString();
//
//        if(num < 0) {
//            str = "-"+str.substring(0, str.length()-1);
//        }
//
//        return Integer.parseInt(str);


        String numAsStr=String.valueOf(num);
        String[] numInStrArray=numAsStr.split("");
        //System.out.println(Arrays.toString(numInStrArray));
        String result="";
        for (int i = numInStrArray.length-1; i >0 ; i--) {
            result+=numInStrArray[i];
        }
        return -1*Integer.parseInt(result);
    }
}

