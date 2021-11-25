package assignment.assignment11_mix;

public class Question40 {

	public static void main(String[] args) {
		
		String[] words = {"aaa","bbbbb","whasstupppp","longg","jaaaaavvaaaaaaa"};
		  	
		String longestWord=words[0];
			
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>longestWord.length()) {
				longestWord = words[i];
			}
		}
			
		System.out.println(longestWord);

	}

}
