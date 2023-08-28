package weeklyMeeting.GroupStudies.ifStatement;

public class ifExample3 {

    public static void main(String[] args) {

        String stuff = "TV";
        String res = "";

//        if (stuff.equals("TV")) {
//            res = "Walter";
//        } else if (stuff.equals("Movie")) {
//            res = "White";
//        } else {
//            res = "No result";
//        }


        res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" : "No result";

        System.out.println(res);
    }
}
