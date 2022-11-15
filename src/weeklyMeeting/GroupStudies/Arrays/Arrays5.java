package weeklyMeeting.GroupStudies.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("A")) {
                continue;

            }
            System.out.println("Work Done");
            continue;
        }

    }
}
