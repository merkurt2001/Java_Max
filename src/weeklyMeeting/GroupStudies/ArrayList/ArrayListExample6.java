package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4));

        list.remove(Integer.parseInt("2"));

        System.out.println(list); //[1, 2, 4]


    }
}
