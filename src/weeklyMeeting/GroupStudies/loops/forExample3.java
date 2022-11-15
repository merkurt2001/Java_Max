package weeklyMeeting.GroupStudies.loops;

public class forExample3 {

    public static void main(String[] args) {

        String str = "Java";
        String str2 = new String(str);
        int count = 10;

        do {
            count += 2;
        } while (str == str2);

        System.out.println(count);


    }
}
