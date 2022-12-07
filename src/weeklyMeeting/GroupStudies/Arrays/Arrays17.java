package weeklyMeeting.GroupStudies.Arrays;

import java.util.Arrays;

public class Arrays17 {
    public static void main(String[] args) {

        int [][] arr = new int[][]{{1,2},{3,4}};
        arr[1] = arr[0];
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));

    }
}
