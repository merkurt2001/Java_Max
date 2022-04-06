package groupStudies.GroupStudies.BulkOperators;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    /*
	 		Create a static method that:
			is called combineALL
			returns an ArrayList
			takes two parameters: an ArrayList of Strings called wordList1,
			and an ArrayList of Strings called wordList2

			This method should create a new ArrayList of Strings,
			add all the words (in order) from wordList1,
			then add all the words (in order) from wordList2.
			In other words, it is combining all the elements from the two parameters.
	 */
    public static void main(String[] args) {

        ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Bir", "Iki", "Uc", "Dort", "Bes"));
        ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));

        System.out.println("combineAll(wordList1, wordList2) = " + combineAll(wordList1, wordList2));

    }

    public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> combined = new ArrayList<>();
//        int i = 0;
//        for (String str : wordList1) {
//            combined.add(i, str);
//            i++;
//
//        }
//        for (String str : wordList2) {
//            combined.add(i, str);
//            i++;
//        }

//        for (int i = 0; i < wordList1.size(); i++) {
//             combined.add(i, wordList1.get(i));
//
//        }
//        for (int i = 0; i < wordList2.size(); i++) {
//             combined.add(wordList1.size()+i , wordList2.get(i));
//
//        }

//        combined.addAll(wordList1);
//        combined.addAll(wordList2);
        return combined;
    }
}
