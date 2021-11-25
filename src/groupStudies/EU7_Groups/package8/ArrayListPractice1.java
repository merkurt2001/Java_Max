package groupStudies.EU7_Groups.package8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>(Arrays.asList("Hi", "Hi", "Yo", "Hi" , "Yo", "The" , "Hey" , "Say"));
       removeAll(list, "Hi");
    
    }

    private static void removeAll(ArrayList<String> wordList, String targetWord) {

//        for (int i = 0; i < wordList.size(); i++) {
//            if (wordList.get(i).equals(targetWord)) {
//                wordList.remove(wordList.get(i));
//                i--;
//            }
//        }
//
//        System.out.println(wordList);

        wordList.removeIf(each -> each.equals(targetWord));
        System.out.println(wordList);

        wordList.removeAll(Arrays.asList("Yo"));

        System.out.println(wordList);

        wordList.addAll(Arrays.asList("Hi", "Hi", "Hello"));

        System.out.println(wordList);

        wordList.retainAll(Arrays.asList("Hi"));
        System.out.println(wordList);

    }
}
