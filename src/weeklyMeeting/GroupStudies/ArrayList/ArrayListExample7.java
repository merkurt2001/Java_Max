package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;

public class ArrayListExample7 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Medina");
        list.add(2, "Erhan");//IndexOutOfBoundsException
        list.add(1, "Hakan");

        System.out.println(list);
    }
}
