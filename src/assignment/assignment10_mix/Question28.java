package assignment.assignment10_mix;

public class Question28 {

	public static void main(String[] args) {
		
		System.out.println(clean("he said bla bla bla","bla"));
		
	}
	
	
	public static String clean (String text ,String badWord) {

		String result="";
		result=text.replaceAll(badWord, "");
			    
		return result;
	
	}

}
