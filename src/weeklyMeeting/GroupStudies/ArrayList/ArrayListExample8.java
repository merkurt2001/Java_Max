package weeklyMeeting.GroupStudies.ArrayList;

import java.util.ArrayList;

public class ArrayListExample8 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Enes");
        names.add("Akobir");
        names.add(1, "Alex");
        names.add(0 , "Alp");

        System.out.println(names); //[Alp, Enes, Alex, Akobir]


    }
}
