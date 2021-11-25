package assignment.assignment13_mix;

import java.util.ArrayList;

public class Question75 {

	  public static void main(String[] args){
		    
		    ArrayList<String>  arr = new ArrayList<String>();
		    arr.add("one");
		    arr.add("apple");
		    arr.add("two orange");
		    arr.add("four banana");
		    
		  
		    String find_tst = search(arr,"four");
		    System.out.print(find_tst);
		    
		    Object[] obj = new Object[2];
		    obj[0] = new int[2];
		    obj[1] = new String[3];
		    
		   
		   
	  }
	  
	  public static String search(ArrayList<String> r, String find){
		    
		    for(String str : r) {
					if(str.contains(find)) {
						return str;
					}
			}
				
			return "search failed";
		    
	  
	  }

}
