package groupStudies.EU7_Groups.BulkOperators;

import java.util.ArrayList;
import java.util.Collections;

public class replaceAll {
    public static void main(String[] args) {
        ArrayList<String> color_list;


        color_list = new ArrayList<> ();




        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Black");
        color_list.add("White");
        color_list.add("Yellow");
        color_list.add("White");

        System.out.println("List of Colors");
        System.out.println(color_list);

        // Replace all colors with White color
        Collections.replaceAll(color_list, "Black", "White");

        System.out.println("Color list, after replacing all Black with White color :");
        System.out.println(color_list);
    }
}
