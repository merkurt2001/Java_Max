package weeklyMeeting.US_Pack;

import java.util.Arrays;
import java.util.Locale;

public class ArrayReview {

    public static void main(String[] args) {

                //declare an int array +initialization
                int[] numbers;
                numbers= new int[6];

                numbers[1] = 22;
                numbers[5] = 56;
                //numbers[2]=4;

                System.out.println("numbers = " + numbers);

                System.out.println( Arrays.toString(numbers));

                System.out.println("element at index 1 = " + numbers[1]);

                System.out.println("using the 2nd term of numbers in code like 5*numbers[1]---> " + 5 * numbers[1]);

                int numberOfelementsInArray = numbers.length;
                System.out.println("numberOfelementsInArray = " + numberOfelementsInArray);

                //declare and initialize at the same time (allowed only in the same statement)

                int numbers2[]= {1, 2, 3, 4, 5};
                //numbers2[]={1,2,3,4,5}; not allowed

                System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));

                //declare and initialize 3 int arrays in one statement->Possible
                int[] numbers3 = {1111, 2, 33, 4} , codes = {1,22,33}  , scores = {1, 2, 3, 4} ;

                System.out.println("Arrays.toString(numbers3) = " + Arrays.toString(numbers3));

                System.out.println("codes-->"+ Arrays.toString(codes));

                System.out.println("scores-->"+Arrays.toString(scores));

                // be careful about where the brackets are!
                double   numbers4[] , codes2 , scores2   ;

                codes2 = 2.0;

                numbers = new int[5];
                System.out.println("numbers = " + Arrays.toString(numbers));

                //Object Array
                Object[] objArray = new Object[5];
                objArray[0] = '#';
                objArray[1] = "smth";
                objArray[2] = 3;
                objArray[3] = "Simon";
                objArray[4] = 5.3d;
                System.out.println("objArray--->" + Arrays.toString(objArray));

                //Double object array

                Double[] d1 = new Double[6];
                d1[3] = 3.7;
                System.out.println("Double Obj array = " + Arrays.toString(d1));

                //declare and initialize at the same time

                int[] numbers5 = new int[6];
                System.out.println(numbers5);
                System.out.println("numbers 5 >>" + Arrays.toString(numbers5));


                int[] numbers6 = {122, 2, 77, 55, 6};

                Arrays.sort(numbers6);
                System.out.println(Arrays.toString(numbers6));




                String str = "david@gmail@hgfAJHGCYTJKhg@jhjkjg1264352";
                String [] strNew=str.split("");
                System.out.println("Arrays.toString(strNew = " + Arrays.toString(strNew));

                Arrays.sort(strNew);
                System.out.println("strAfterSort = " + Arrays.toString(strNew));

                System.out.println("char Array --> "+Arrays.toString(str.toCharArray()));

                System.out.println("split via @ --> "+Arrays.toString(str.split("@")));


                String str2=str.split("@")[3];
                System.out.println("str2 = " + str2);

                System.out.println("split via emptySpace --> "+Arrays.toString(str.split("")));

                String newStr=str.split("")[5].toLowerCase(Locale.ROOT);

                System.out.println("newStr = " + newStr);



                String[] myNewArr = str.split("@");

                System.out.println("element at index 0--> " + myNewArr[0]);


    }
}
