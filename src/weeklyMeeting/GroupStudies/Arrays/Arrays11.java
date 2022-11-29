package weeklyMeeting.GroupStudies.Arrays;

public class Arrays11 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int size = arr.length;
        int idx = 0;

        do {
            idx++;
        } while (idx < size-1);

        System.out.println(arr[idx]);


    }
}
