package assignment.assignment10_mix;

public class Question29 {

	public static void main(String[] args) {
		
		System.out.println(limit("abcd",2));
	
	}
	
	public static String limit(String text, int maxLength) {

		String result = "";

		result = text.substring(0, maxLength);

		return result;
	
	}

}
