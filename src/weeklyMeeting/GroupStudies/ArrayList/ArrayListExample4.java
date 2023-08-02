package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;

public class ArrayListExample4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("kiwi");
        list.add("grapes");
        list.add("banana");
        list.remove(1);
        list.add("apple");
        list.remove("grapes");

        System.out.println(list); //[mango, banana, apple]
    }
}
