package assignment.assignment10_mix;

public class Question26 {

	public static void main(String[] args) {
	
	    System.out.println( uniqueChars("mama") ) ;
	    
	    String str = "Java";
	    System.out.println(str.toString());
	    System.out.println(str.hashCode());


	}
	  
	  public static String uniqueChars(String str) {
	  
		String nonDuplicate = "";

		for (int i = 0; i < str.length(); i++) {
			if (!nonDuplicate.contains("" + str.charAt(i))) {
				nonDuplicate += "" + str.charAt(i);
			}
		}

		return nonDuplicate;
		
	  }

}

/*public static void uniqueChars(String word) {

        String uniques = "";

        for (int i = 0; i < word.length(); i++) {

            String myChar = "" + word.charAt(i);

            if (! uniques.contains(myChar)) {
                uniques += myChar;
            }
        }
        System.out.println(uniques);
    }*/
