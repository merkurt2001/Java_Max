package weeklyMeeting.GroupStudies.MemoryAllocation;

import java.util.ArrayList;

public class objectType {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        data.add("one");
        data.add("two");
        data.add("three");

        System.out.println(data);

        printObj(data);
        System.out.println(data);


    }

    private static void printObj(ArrayList<String> data) {

        data.add("four");
    }

}
