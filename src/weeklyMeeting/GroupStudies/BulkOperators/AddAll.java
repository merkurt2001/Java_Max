package weeklyMeeting.GroupStudies.BulkOperators;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        // create an empty array list with an initial capacity
        ArrayList<String> color_list = new ArrayList<>();

        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");

        // Print out the colors in the ArrayList
        System.out.println("****Color list****");
        System.out.println(color_list);

        // create an empty array sample with an initial capacity
        ArrayList<String> sample = new ArrayList<String>(3);
        sample.add("Yellow");
        sample.add("Red");
        sample.add("White");

        // Now add sample with color_list
        color_list.addAll(sample);

        //New size of the list
        System.out.println("New size of the list is: " + color_list.size());

        // Print out the colors


        System.out.println(color_list);

    }
}

