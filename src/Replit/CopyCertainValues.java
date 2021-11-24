import java.util.ArrayList;
import java.util.Arrays;

public class CopyCertainValues {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {

		// TODO : YOUR CODE GOES HERE ----------------------
		ArrayList<String> fewValues = new ArrayList<>();
		 for(int i=0; i<arr.length; i++) {
		    	if(arr[i].contains("e")) {
		    		fewValues.add(arr[i]);
		    	}
		 }
		  
//		 String[] arr2 = new String[arr.length];
//	    int j = 0;
//		 for(int i=0; i<arr.length; i++) {
//	    	if(arr[i].contains("e")) {
//	    		arr2[j] = arr[i];
//	    		j++;
//	    	}
//	    }
//		
//		String[] fewValues = new String[j];
//		for(int i=0; i<j; i++) {
//			fewValues[i] = arr2[i];
//		}
		  
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
		 Object[] gfg= fewValues.toArray();
				 String[] str = Arrays.copyOf(gfg, 
				                              gfg.length, 
				                              String[].class);
	    return str;
	    

}
}