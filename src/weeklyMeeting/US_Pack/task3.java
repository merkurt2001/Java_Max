package weeklyMeeting.US_Pack;

public class task3 {
    public static void main(String[] args) {
        removeDup("AABBAACCDDDAADDBB");
    }

    private static void removeDup(String str) {


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!result.toString().contains("" + str.charAt(i))){
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
