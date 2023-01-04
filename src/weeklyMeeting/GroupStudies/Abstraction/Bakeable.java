package weeklyMeeting.GroupStudies.Abstraction;

public interface Bakeable {

    public default void bakeInOven(){//since Java 8 "public default"
        //code
    }

    public static void bake(String str){//"public static"
        //code
    }


}
