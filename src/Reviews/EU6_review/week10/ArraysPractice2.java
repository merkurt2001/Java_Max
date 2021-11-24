package Reviews.EU6_review.week10;

import java.util.Arrays;

public class ArraysPractice2 {

	public static void main(String[] args) {
		
		String[] names = {"Selda", "Zeynap", "Selcuk", "Ali", "Niyazi"};
		//					0         1          2        3      4
		
		Arrays.sort(names);  //Asc :  [Ali, Niyazi, Selcuk, Selda, Zeynap]
								//      0     1       2        3     4
		
		String[] namesDesc = new String[names.length]; // {  Zeynap, Selda, Selcuk, Niyazi, Ali}
														//      0      1       2      3      4
		
		for(int i = names.length-1, j = 0; i >= 0; i--, j++ ) {
			namesDesc[j] = names[i];
		}
		
		
		System.out.println( Arrays.toString( names ) );
		System.out.println(Arrays.toString(namesDesc));
		
		System.out.println("-----------------------------------------------");
		// sentence: I love Java ==> {I, love, Java}
		// reverse: Java love I
		
		String sentence = "I love Java";
		String[] words = sentence.split(" ");
		
		System.out.println( Arrays.toString(words));
		
		String reverse = ""; //"Java love I"
		
		for(int i =words.length-1; i >=0; i--) {
			reverse += words[i]+" ";
		}
		
		System.out.println(reverse);
		
		
		
		
		
	}
	
}
