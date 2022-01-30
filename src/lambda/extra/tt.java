package lambda.extra;

public class tt {
    public static void main(String[] args) {
        String s = "AAAAAAB";
        int count1=0;
        int count2=0;
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)=='A') {
                 ;
                 count1++;
             }else {
                 count2++;
             }

        }
        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
        System.out.println("result : "+(count1-count2));
    }}
