package assignment.assignment12_mix;

import java.util.ArrayList;

public class Question65 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("orange");
		al.add("banana");
		al.add("milk");
		al.add("bread");
		al.add("butter");
		al.add("milk");
		
		removeAll(al, "milk");
		
	}
	
	public static void removeAll(ArrayList<String> wordList,  String targetWord)  {
		
		for (int i = 0; i < wordList.size(); i++) {
	
		  if(wordList.get(i).equals(targetWord)) {
			
			wordList.remove(i);
		  
		  }
		
		}
		
		System.out.println(wordList);

	}

}
