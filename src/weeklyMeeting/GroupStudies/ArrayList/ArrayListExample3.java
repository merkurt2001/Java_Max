package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample3 {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        arrList.set(0, arrList.get(4));
        arrList.set(4, arrList.get(0));

        System.out.println(arrList); //[5, 2, 3, 4, 5]


    }
}
