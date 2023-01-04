package weeklyMeeting.GroupStudies.Abstraction;

public interface Cookable { //100% percent abstraction in Java is achieved using "interfaces"

    //- Interfaces can only use public access modifier
    public static final String ACTION = "Cook";

    boolean CAN_BE_COOKED = true;  // same as public static final boolean CAN_BE_COOKED
    public abstract void cook();

    void store();


   /* What can not an interface have?
    No constructor
    No static block
    No instance block
    No access modifier other than "public"
    An interface can "extends" multiple interfaces
    A class can "implements" multiple interfaces
    A class can "extends" only one class*/


}
