package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BulkOpGeneral {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<>();
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");

        System.out.println(color_list);

        ArrayList<String> sample = new ArrayList<>();
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");
        System.out.println(sample);

        color_list.addAll(sample); //this method is used to append all of the elements in the specified collection to the end of the list.
        System.out.println(color_list);

        //Replace all White colors with Black

        Collections.replaceAll(color_list, "White", "Black");// this method is used to replace each element of this list with the result of appliying the operator that element
        System.out.println(color_list);

        color_list.retainAll(sample);//this method is used to remove it’s elements from a list that are not contained in the specific collection
        System.out.println(color_list);

        color_list.removeIf(p -> p.equals("Red"));//this method is used to remove all of the elements of this collection that satisfy the given predicate.
        System.out.println(color_list);

        color_list.removeAll(sample);//this method is used to remove all the elements from a list that are contained in the specific collection
        System.out.println(color_list);
    }
}
