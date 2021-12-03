package lambda.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {

        Function<String, String> reverse = s ->{
            String result = "";
            for(int i = s.length()-1; i >=0; i--)
                result += s.charAt(i);
            return result;
        };

       String str1 = reverse.apply("Cybertek");
        System.out.println(str1);

        System.out.println("-------------------------------------");

        Function<String, Boolean> isPalindrome = s -> reverse.apply(s).equalsIgnoreCase(s);

        boolean r = isPalindrome.apply("Anna");

        System.out.println(r);

        System.out.println("-------------------------------------");

        Function<int[], int[]> reverseIntArray = a ->{
            int[] result = new int[a.length];
            for (int i = 0, j =a.length-1; i < a.length; i++, j--) {
                result[j] = a[i];
            }
            return result;
        };


        int[] arr1 = {1,2,3,4,5};
       int[] arr2 = reverseIntArray.apply(arr1);

        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------------------");

        Integer[] numbers= {1,2,3,4,5,6,7,1,2,3,4,5,6,7,8};

        numbers = Arrays.asList(numbers).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));




    }
}
