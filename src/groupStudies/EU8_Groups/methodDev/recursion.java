package groupStudies.EU8_Groups.methodDev;

public class recursion {
    public static void main(String[] args) {

        printNumber(10);
    }

    public static void printNumber(int n) {

        if (n <= 0) {
            System.out.println("end of story");
            return;
        }

        System.out.println(n);
        printNumber(n - 1);
    }

}
