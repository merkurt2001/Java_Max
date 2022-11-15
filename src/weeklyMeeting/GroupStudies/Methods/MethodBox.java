package weeklyMeeting.GroupStudies.Methods;

public class MethodBox {

    public static void main(String[] args) {

        System.out.println(drawBox(25));


    }

    public static String drawBox(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println("+-----+");
            System.out.println("|     |");
            System.out.println("|     |");
            System.out.println("|     |");
            System.out.println("+-----+");

        }

        return number + " Boxes produced";


    }


}
