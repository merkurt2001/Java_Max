package groupStudies.EU8_Groups.methodDev;

public class methorUsage {

    public static void main(String[] args) {

        egg();
        teaCup();
        stopSign();
        hat();
    }

    public static void eggTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void eggBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
    }

    public static void egg() {

        eggTop();
        eggBottom();

    }

    public static void teaCup() {
        eggBottom();
        line();
        System.out.println();
    }

    public static void stopSign() {
        eggTop();
        System.out.println("|  STOP  |");
        eggBottom();
        System.out.println();
    }

    public static void hat() {
        eggTop();
        line();
    }

    public static void line() {
        System.out.println("+--------+");
    }

}

