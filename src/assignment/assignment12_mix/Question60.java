package assignment.assignment12_mix;

import java.util.ArrayList;

public class Question60 {

	public static void main(String[] args) {
		
		String[] arr1 = {"f","o","o"};
		String[] arr2 = {"b","a","r"};
		
		String result=combineRs(arr1,arr2);
		System.out.println(result);
		
	}
	
	public static String combineRs(String[]  s1 ,String []s2) {
		
		ArrayList<String> list= new ArrayList<>();
		    
		String result="";
		    
		for (int i=0; i<s1.length; i++){
			list.add(s1[i]);
		}
		 
		for (int i=0; i<s2.length; i++){
			list.add(s2[i]);
		}
		
		for(String each:list){
			result=result+each;
		}
		
		return result;
	}

}



