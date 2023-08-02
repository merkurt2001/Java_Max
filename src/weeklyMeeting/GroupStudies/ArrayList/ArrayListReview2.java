package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 44, 1, 3, 5, 1, 10, 100, 55));

        System.out.println(nums);

        nums.remove(4);
        System.out.println(nums);

        Integer n1 = new Integer(4); //converting primitive to OBJ
        nums.remove(n1);
        System.out.println(nums);


        nums.remove(new Integer(44));//removes the specified element from the list

        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 5, 100, 55));

        System.out.println("nums.equals(nums2) = " + nums.equals(nums2));

        Collections.sort(nums);
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);

        Collections.swap(nums, 0, 3);
        System.out.println(nums);

        int max = Collections.max(nums);
        System.out.println(max);
        int min = Collections.min(nums);
        System.out.println(min);

        int frequency = Collections.frequency(nums, 1);
        System.out.println(frequency);
    }
}
