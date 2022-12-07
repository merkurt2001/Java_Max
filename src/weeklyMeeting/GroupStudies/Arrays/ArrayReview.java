package weeklyMeeting.GroupStudies.Arrays;

import java.util.Arrays;
import java.util.Locale;

public class ArrayReview {

    public static void main(String[] args) {

        //declare and int array + initialization
        int[] numbers;
        numbers = new int[6];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(numbers); //gives hascode of the array obj
        System.out.println("This is how we print arrays elements = " + Arrays.toString(numbers));

        System.out.println("second element of the array = " + numbers[1]);
        System.out.println("not assign element = " + numbers[5]); //default value of the int is 0
        //System.out.println("not existed element = " + numbers[7]);//ArrayIndexOutOfBoundsException

        int numberOfTheElement = numbers.length;
        System.out.println(numberOfTheElement);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 2) {
                break;
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //declare and initialize at the same line

        int numbers1[] = {1, 2, 3, 4, 5};
        // numbers2[] = {1, 2, 3, 4, 5}; // not allowed

        //declare and initialize 3 int arrays in one statement
        int[] numbers2, numbers3, numbers4;
        numbers2 = new int[3];
        numbers3 = new int[2];
        numbers4 = new int[4];


        double numbers5[], num1, num2; //be carefull where the brackets are!!!
        numbers5 = new double[2];
        //num1 = new double[3]; // this is not an array
        num1 = 5.4;

        Object[] objArray = new Object[4];
        objArray[0] = 1;
        objArray[1] = "hello";
        objArray[2] = 1.4;
        objArray[3] = 'c';

        System.out.println("obj array = " + Arrays.toString(objArray));

        int[] numbers7 = {122, 45, 67, 3, 6};
        Arrays.sort(numbers7);
        System.out.println("sorted array = " + Arrays.toString(numbers7));

        String str = "macimilian@cyertekschool.com@09347#%#Q%#@%";

        String[] strNew = str.split("");
        System.out.println("Array with split method " + Arrays.toString(strNew));

        System.out.println("char array = " + Arrays.toString(str.toCharArray()));

        Arrays.sort(strNew);
        System.out.println("str after sorted " + Arrays.toString(strNew));

        System.out.println("split via @ = " + Arrays.toString(str.split("@")));

        String str2 = str.split("@")[1].split("")[5].toUpperCase();
        //cydeo.com
        System.out.println(str2);


        int[] arr = Arrays.copyOf(numbers, 6);

        System.out.println("clone array = " + Arrays.toString(arr));

        System.out.println("compare 2 array = " + Arrays.equals(numbers, arr));


    }
}
