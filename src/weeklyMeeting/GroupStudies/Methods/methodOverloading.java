package weeklyMeeting.GroupStudies.Methods;

public class methodOverloading {

    public static void main(String[] args) {

        int x = 10, y = 20;

        //the argument "int y" is promoted to long data type
        add(x, y);
    }

    public static void add(int x) {                   //method with one int
        System.out.println(x);
        System.out.println("integer");
    }

    public static void add(int x, long y) {           //method with int and long
        System.out.println(x + y);
        System.out.println("integer and long");
    }


}
