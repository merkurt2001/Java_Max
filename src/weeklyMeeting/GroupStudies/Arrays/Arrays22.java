package weeklyMeeting.GroupStudies.Arrays;

public class Arrays22 {
    public static void main(String[] args) {
        String str1 = "Java";
        String []  str2 = {"J","a","v","a"};
        String str3 = "";

        for (int i = 0; i < str2.length; i++) {
            str3 += str2 [i];
        }

        System.out.println(str3);

        boolean b1 = str1 == str3;
        boolean b2 = str1.equals(str3);

        System.out.println(b1);
        System.out.println(b2);
    }
}
