package lambda.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionInterface {

    public static void main(String[] args) {

        Consumer<String>  printThreeTimes = s -> System.out.println(s+s+s);

        printThreeTimes.accept("Cybertek");

        System.out.println("---------------------------------------");

        Consumer<List<String>> printEach = list -> {
            for (String s : list) {
                System.out.print(s+" ");
            }
            System.out.println();
        };

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("John", "Shay", "Breanna", "Erick"));

        printEach.accept(names);

        System.out.println("-------------------------------------------");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       // Consumer<List<Integer>> multiplyBy2 = list -> { }

        numbers.forEach(  n -> System.out.println(n*2) );

        System.out.println("----------------------------------------");
        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("Java", "Java", "Cybertek", "Python", "Python"));

        List<String> duplicatedElements = new ArrayList<>();

        Predicate<String> isDuplicated = p -> Collections.frequency(elements, p) > 1;

        elements.forEach( s ->{
            if(isDuplicated.test(s))
                if(!duplicatedElements.contains(s))
                    duplicatedElements.add(s);
        } );

        System.out.println(duplicatedElements);

        System.out.println("--------------------------------");

        Consumer<String[]> printDescendingOrder = arr -> {
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        };

        //int[] array = {10, 20, 30, 5, 4, 3, 1, 2, 100, 0};
        String[] array = {"A", "B", "C", "D"};
        printDescendingOrder.accept(array);




    }

}
