package lambda.extra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
in functional prog. we use lambda expression
if using "Method reference" is possible
Class name :: Method Name
for example String :: length  ( do not use method brackets)
 */
public class Lambda02 {
    Utils util;
    public static void main(String[] args) {
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

       /* printTheList(l);
        System.out.println();
        printTheList01(l);
        System.out.println();
        printEvenElements(l);
        System.out.println();
        printSquareOddElement(l);*/
       // printCubeOfDistincElement(l);
       // sumOfSquareOfDistinctEvenElement(l);
       // productOfCubesOfDistinctEvenElement(l);
       // getMax(l);
       // getMin(l);
       // getMinGreaterThanSeven(l);
        getHalfOfDistainctElementInReverseOrder(l);


    }
    public static void printTheList(List<Integer>list){
        for (Integer w:list){
            System.out.print( w+" ");
        }
    }
    public static void printTheList01(List<Integer>list){
        list.stream().forEach(Utils::printInTheSameLineWithSpace);
    }
    public static void printEvenElements(List<Integer>list){
        list.stream().distinct().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithSpace);
    }
    public static void printSquareOddElement(List<Integer>list){
        list.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithSpace);
    }
    public static void printCubeOfDistincElement(List<Integer>list){
        list.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithSpace);
    }
    public static void sumOfSquareOfDistinctEvenElement(List<Integer>list){
      Integer sum=  list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(Math::addExact).get();
        System.out.println("sum = " + sum);
    }
    public static void productOfCubesOfDistinctEvenElement(List<Integer>list){
      Integer product=  list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(1,Math::multiplyExact);
        System.out.println("product = " + product);
    }

    public static void getMax(List<Integer>list){
       Integer max= list.stream().reduce(Integer.MIN_VALUE,(Math:: max));
        System.out.println(max);
    }
    public static void getMin(List<Integer>list){
        Integer min= list.stream().reduce(Integer.MAX_VALUE,(Math:: min));
        System.out.println(min);
    }
    public static void getMinGreaterThanSeven(List<Integer>list){
      Integer min=  list.stream().filter(t->t>7).reduce(Integer.MAX_VALUE,(Math::min));
        System.out.println("min = " + min);
    }
    public static void getHalfOfDistainctElementInReverseOrder(List<Integer>list){
       List<Double> result= list.stream()
               .distinct().filter(t->t>5)
               .map(Utils::getHalf)
               .sorted(Comparator.reverseOrder())
               .collect(Collectors.toList());
        System.out.println("result = " + result);

    }

}
