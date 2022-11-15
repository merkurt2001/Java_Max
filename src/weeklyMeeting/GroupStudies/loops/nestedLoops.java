package weeklyMeeting.GroupStudies.loops;

public class nestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }


        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j > i - 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.print(i);
            System.out.println();

        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j > i - 1; j--) {
                System.out.print("*" + " ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j > i - 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.print(i + " ");
            for (int j = 1; j < i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();

        }
        System.out.println();


    }
}
//Number-1
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

//Number-2
//*
//* *
//* * *
//* * * *
//* * * * *

//Number-3
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5

//Number-4
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

//Number-5
//* * * * *
//* * * *
//* * *
//* *
//*

//Number-6
//****1
//***2
//**3
//*4
//5

//Number-8
//****1
//***22
//**333
//*4444
//55555

//Number-9
//****1
//***2*
//**3**
//*4***
//5****