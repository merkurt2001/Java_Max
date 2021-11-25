package assignment.assignment10_mix;

public class Question30 {

	public static void main(String[] args) {
		
		System.out.println(at3("longword", "foo"));
		
	}
	
	
	public static String at3(String target,String word){
		    
		String result = "";

		result = target.substring(0, 3) + word + target.substring(3);

		return result;
	
	}

}
