public class WordCount {

	public static void main(String[] args) {
		System.out.println(wordCount("foo bar ah tah"));
	
	}

	public static int wordCount(String words) {
		
		String[] allwords = words.split(" ");
		
		return allwords.length;

	}

}