package assignment.assignment12_mix;

import java.util.ArrayList;

public class Question64 {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("apple");
		a1.add("orange");
		a1.add("banana");
		
		ArrayList<String> a2 = new ArrayList<>();
		a1.add("milk");
		a1.add("bread");
		a1.add("cheese");
		
		System.out.println(combineAL(a1, a2));
		
	}
	
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {

		ArrayList<String> wordListAll = new ArrayList<String>();

		for (int i = 0; i < wordList1.size(); i++) {

			wordListAll.add(wordList1.get(i));
		}

		for (int i = 0; i < wordList2.size(); i++) {

			wordListAll.add(wordList2.get(i));
		}
		
		return wordListAll;
	}

}
