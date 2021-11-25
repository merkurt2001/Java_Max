package assignment.assignment11_mix;

public class Question45 {

	public static void main(String[] args) {
		
		String[] str = {"java","cable","red","vivid","remedy","grace"};
		
	    String shortest=str[0];
	    
	    for (int i = 1; i < str.length; i++) {
	    	if (str[i].length()<= shortest.length()) {
	    		shortest=str[i];
			}
		}
	    
	    System.out.println(shortest);
		

	}

}
