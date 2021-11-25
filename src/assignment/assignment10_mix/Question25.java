package assignment.assignment10_mix;

public class Question25 {

	public static void main(String[] args) {
		
		System.out.println(mergeStrings("wooden", "spoon"));


	}
	
	  public static String mergeStrings(String one, String two) {
		    
		  String result = "";

		  for (int i=0; i<one.length() || i<two.length(); i++) {
			  if (i < one.length()) {
				  result = result+one.charAt(i);
			  }

		      if (i < two.length()) {
		    	  result = result+two.charAt(i);
		      }
		  }

		  return result;

	  }

}

/*public static void mergeStrings(String s1, String s2) {

        String result = "";

        for (int i = 0; i < s1.length() || i < s2.length(); i++) {

            if (i < s1.length())
                result += s1.charAt(i);

            if (i < s2.length())
                result += s2.charAt(i);
        }

        System.out.println("result = " + result);
    }*/
