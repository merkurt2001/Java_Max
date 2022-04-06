package groupStudies.GroupStudies.loops;

public class printEvenNumbers {
    public static void main(String[] args) {
        /**
         * print even numbers from 0-100
         */
        boolean flag = true;
        for (int i = 0; i <= 5; i++) {
            if (flag) {
                System.out.print(i + " ");
            }
            flag = !flag;

        }

        //print even numbers with modulus 2

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }


        //print even numbers from 1 to 100

        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("i = " + i);
        }

    }
}
