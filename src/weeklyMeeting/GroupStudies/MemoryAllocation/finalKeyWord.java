package weeklyMeeting.GroupStudies.MemoryAllocation;

public class finalKeyWord {

    public static void main(String[] args) {
        final Customer c = new Customer("Jhon");

        System.out.println(c.getName());//print Jhon
        System.out.println(c.getName());//print XXX

    }
}
