package weeklyMeeting.GroupStudies.BulkOperators;

import java.util.ArrayList;

public class removeIf {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<>();

        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        color_list.add("Yellow");
        color_list.add("White");

        System.out.println("List of Colors");
        System.out.println(color_list);

        // Remove all White colors from color_list
        color_list.removeIf(apple -> apple.equals("White"));

        System.out.println("Color list, after removing White colors :");
        System.out.println(color_list);

    }
}

