package groupStudies.EU7_Groups.StaticKeyWord;

public class printHelloWithoutMain {

//    static {
//        System.out.println("Hello");
//    }
    public static int printString(){
        System.out.println("Hello");
        return 1;
    }
    static int x = printString();

    public static void main(String[] args) {

    }
}
