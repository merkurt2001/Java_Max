package Reviews.EU6_review.week9;

public class FrequencyOfWord2 {
	
	public static void main(String[] args) {
		
		String str = "javaa";
		
		str = str.replaceFirst("a", "");
		str = str.replaceFirst("a", "");
		str = str.replaceFirst("a", "");
		
		System.out.println(str);
		
		System.out.println("--------------------------------------------");
		
		String sentence = "Java Java Java JAVA JaVA";
		String word = "java";
		
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		
		int count =0;
		
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
		
		
		
		
	}
	

}
