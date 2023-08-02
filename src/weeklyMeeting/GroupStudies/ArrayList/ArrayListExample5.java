package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample5 {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer each : arrList) {

            if (each % 2 != 0){
                continue;
            }
            System.out.print(each + " ");
        }
    }
}
