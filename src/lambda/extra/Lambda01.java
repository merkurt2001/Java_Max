package lambda.extra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        // functional programming is only for Collections and Arrays
        // FP is waht to do ? Structure Programming is How to do?
        // We can not use FP in Maps directly if we convert Maps to Sets by using
        // entrySet() method we can use it.

        List<Integer> l= new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(10);
        l.add(9);
        l.add(2);
        l.add(8);
        l.add(15);

     //  printElementsStructured(l);
       // System.out.println(" ");
        //printElementsFunctional(l);
      //  printEvenElementsStructured(l);
       // printEvenElementsFunctional(l);
       // printSquareOfOddElement(l);
       // printCubesOfDistinctElements(l);
      //  printSumOfEvenElements(l);
      //  printProductOfOddElements(l);
       // getMaxElement(l);
        //getMaxElement01(l);
     //   getMinElement01(l);
       // getMinGreaterThanSeven(l);
        //getMinGreaterThanSeven01(l);
        getHalfOfDistinctElementInReverseOrder(l);
    }
    public static void printElementsStructured(List<Integer> list){
        for(Integer w:list){
            System.out.print( w + " ");
        }
    }
    public static void printElementsFunctional(List<Integer> list){
        list.forEach(a ->System.out.print(a + " "));
        list.stream().forEach(t->System.out.println(t+ " "));
    }
    public static  void printEvenElementsStructured(List<Integer>list){

        for(Integer w :list){
            if(w%2==0){
                System.out.print(w +" ");
            }
        }
    }
    public static  void printEvenElementsFunctional(List<Integer>list){
        list.stream().filter(a->a%2==0).forEach(a->System.out.print(a +" "));
    }
    public static  void printSquareOfOddElement(List<Integer>list){
        list.stream().filter(a->a%2==1).map(a->a*a).forEach(a-> System.out.print(a+" "));
        // Map is used to update the list element
    }
    public static  void printCubesOfDistinctElements(List<Integer>list){
        list.stream().distinct().filter(a-> a%2==1).map(a->a*a*a).forEach(a->System.out.print(a+" "));

    }
    public static  void printSumOfEvenElements(List<Integer>list){
      Integer sum=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println("sum = " + sum);
    }
    public static  void printProductOfOddElements(List<Integer>list){
       Integer mul= list.stream().distinct().filter(t->t%2==0).map(t-> t*t*t).reduce(01,(t,u)->t*u);
        System.out.println("multiple = " + mul);
    }
    public static  void getMaxElement(List<Integer>list){
     //  Integer maxElement= list.stream().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t: u);
       Integer maxElement= list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t: u);
        System.out.println("maxElement = " + maxElement);

    }
    public static  void getMaxElement01(List<Integer>list){
        Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
        System.out.println("max = " + max);
    }
    public static  void getMinElement01(List<Integer>list){
        Integer min= list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        Integer min1=list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println("min = " + min);
        System.out.println("min1 = " + min1);
    }

    public static  void getMinGreaterThanSeven(List<Integer>list){
        Integer minGreaterThanSeven= list.stream().filter(t->t> 7).filter(t->t%2==0).
                reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t :u);
        System.out.println("minGreaterThanSeven = " + minGreaterThanSeven);
    }
    public static  void getMinGreaterThanSeven01(List<Integer>list){
        Integer minGreaterThanSeven= list.
                stream().
                filter(t->t> 7).
                filter(t->t%2==0).
                sorted(Comparator.reverseOrder()).
               // sorted(Collections.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t,u)-> u );
        System.out.println("minGreaterThanSeven = " + minGreaterThanSeven);

        Integer min1=list.
                stream().
                distinct().
                filter(t -> t > 7).
                filter(t -> t % 2 == 0).
                sorted().
                findFirst().
                get();
        // get() not to complain.. otherwise it will ask for Optional
        System.out.println("min1 = " + min1);

    }
    public static  void getHalfOfDistinctElementInReverseOrder(List<Integer>list){

       List<Double> result= list.
                stream().
                distinct().
                filter(t->t>5).
                map(t->t/2.0).
                sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("result = " + result);
    }


}
