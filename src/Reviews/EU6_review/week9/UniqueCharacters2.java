package Reviews.EU6_review.week9;

public class UniqueCharacters2 {
	
	public static void main(String[] args) {
		String str = "aaabccccd";
		String result = "";
		
		for(int i=0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if( str.indexOf(ch) == str.lastIndexOf(ch)){
				result += ch;
			}
			
		}
		
		System.out.println(result);
		
		
		
		/*
		 a:
		 	indexOf(a) ==> 0
		 	lastIndexOf(a) ==> 2
		 	
	 	b:
	 		indexOf(b) ==>3
	 		lastIndexOf(b) ==> 3
		 */
		
		
	}

}
