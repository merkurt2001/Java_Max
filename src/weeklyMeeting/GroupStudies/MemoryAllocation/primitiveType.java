package weeklyMeeting.GroupStudies.MemoryAllocation;

public class primitiveType {

    public static void main(String[] args) {

        int data = 7;

        calculate(data);

        System.out.println(data);

    }

    private static int calculate(int data) {

        data = data +1;
        return data;


    }
}
