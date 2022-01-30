package lambda.extra;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
       // revomeIfLEnghtIsBetween8And10EndingWithO(l);
        System.out.println(checkAllEleemntLenghtLessThanTwelve(l));
        System.out.println(    noMatchOfListStartsWithX(l));
        System.out.println(anyMatchOfListEndingWithR(l));
    }
    public static void revomeIfLEnghtIsBetween8And10EndingWithO(List<String >list){
        list.removeIf(t->t.length()>7 &&t.length()<11 || t.endsWith("o"));
        System.out.println(list);
    }
    // check all elements lenght  in the list is less than 12
    public  static boolean checkAllEleemntLenghtLessThanTwelve(List<String >list){
      return list.stream().allMatch(t-> t.length()<12);

      // Returns boolean
    }
    // no name startswith X we use nonMatch() method
public static boolean noMatchOfListStartsWithX(List<String >list){
     return   list.stream().noneMatch(t-> t.startsWith("X"));

}
    public static boolean anyMatchOfListEndingWithR(List<String >list) {
        return list.stream().anyMatch(t -> t.endsWith("r"));
    }
}
