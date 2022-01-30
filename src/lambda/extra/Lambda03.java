package lambda.extra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christoper");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
       // printAllUpperCase(l);
        System.out.println();
       // printAllUpperCase01(l);
       // printElementsSortedByLenght(l);
        //printDistinctSortedByLastChar(l);
        System.out.println();
        //printDistinctSortedByFirstChar(l);
        System.out.println();
        //sortByLenghtAndFirstChar(l);
        revomeIfTheLenghtGreaterThanFive(l);
    }

    public static void printAllUpperCase(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);

    }
    /*public static void printAllUpperCase01(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println("list = " + list);
    }*/

    public static void printElementsSortedByLenght(List<String >list){
        list.stream().sorted(Comparator.comparing(String:: length)).forEach(Utils::printInTheSameLineWithSpace);
        System.out.println();
        list.stream().sorted(Comparator.comparing(String:: length).reversed()).forEach(Utils::printInTheSameLineWithSpace);
    }

    public static void printDistinctSortedByLastChar(List<String >list){
        list.stream().distinct()
                .sorted(Comparator
                        .comparing(Utils::getLastChar))
                .forEach(Utils::printInTheSameLineWithSpace);
    }
    public static void printDistinctSortedByFirstChar(List<String >list){
        list.stream().distinct()
                .sorted(Comparator
                        .comparing(Utils::getFirstChar))
                .forEach(Utils::printInTheSameLineWithSpace);
    }

    public static void sortByLenghtAndFirstChar(List<String >list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar))
                .forEach(Utils::printInTheSameLineWithSpace);
    }

    // Remove the element if the lenght of the element id greater than 5
    public static void revomeIfTheLenghtGreaterThanFive(List<String >list){
        list.removeIf(t->t.length()>5);
        System.out.println("list = " + list);
    }
}
