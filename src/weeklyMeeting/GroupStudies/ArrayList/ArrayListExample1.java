package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.remove("Mango");
        list.add("Kiwi");
        list.add(3, "Strawberry");
        list.remove(2);

        System.out.println(list); //[Apple, Banana, Strawberry, Kiwi]
    }
}
