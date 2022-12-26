package weeklyMeeting.GroupStudies.Abstraction;

public interface Cookable {

    //- Interfaces can only use public access modifier
    public static final String ACTION = "Cook";

    boolean CAN_BE_COOKED = true;  // same as public static final boolean CAN_BE_COOKED
    public abstract void cook();

    void store();
}
