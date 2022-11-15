package weeklyMeeting.GroupStudies.package8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOps {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 1, 1, 1, 3, 3, 4));
        nums.forEach(p -> System.out.println(p));

        nums.removeAll(Arrays.asList(1, 2));
        System.out.println(nums);

        nums.retainAll(Arrays.asList(3, 4));
        System.out.println(nums);

        nums.removeIf(p -> p == 3);
        System.out.println(nums);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("ahmet", "ahmet", "ahmet", "ahmet", "Mehmet", "Ali", "mahmut", "recep"));
//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).equals("ahmet")) {
//                names.remove(i);
//                i--;
//            }
//
//        }

        names.removeIf(p -> p.equals("ahmet"));
        System.out.println(names);


    }
}
