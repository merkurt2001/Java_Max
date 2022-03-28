package groupStudies.EU8_Groups.methodDev;

public class MethodBox {

    public static void main(String[] args) {

       int numberOfBoxes= drawBox(10);
        System.out.println(numberOfBoxes + " boxes produced");
        System.out.println(drawBox(5)+ " boxes produced");


    }

    public static int drawBox(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("+-----+");
            System.out.println("|     |");
            System.out.println("|     |");
            System.out.println("|     |");
            System.out.println("+-----+");
        }
        return num;

    }

}
