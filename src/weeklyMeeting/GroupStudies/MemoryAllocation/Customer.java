package weeklyMeeting.GroupStudies.MemoryAllocation;

public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        String temp = this.name;
        this.name = "XXX";
        return temp;
    }

}
