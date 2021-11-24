package Reviews.EU6_review.week9;

public class FrequencyOfWord {
	
	public static void main(String[] args) {
		String sentence = "I like cybertek, Cybertek is a good school cybertek";
					//senetence.substring(2, 6)
		
		String word = "CYBERTEK";
		int count =0 ;
		
		
		for(int i=0; i <= sentence.length()- word.length() ; i++) {
			String each = sentence.substring(i, i+word.length());
			if(each.equalsIgnoreCase(word)) {
				count++;
			}
			
		}
		
		
		System.out.println(count);
		
		
		
		
	}
	

}
