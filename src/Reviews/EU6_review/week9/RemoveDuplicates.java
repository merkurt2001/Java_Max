package Reviews.EU6_review.week9;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		String str = "aaabbbbccccddddeeeeaaaabbbbccccffffggggghhhhhiiii";
		String result = "";	  // "abc"
		
		for(int i = 0; i < str.length(); i++) { //i: 0,1,2,3,4,5,6
			char ch =  str.charAt(i); //ch:  a,a,a,b,b,c,c
			
			if(!result.contains(""+ch)) {  //'a' ==> "a"
				result += ch;
			}
			
		}
		
		
		System.out.println(result);
		
		
		
		
		
	}
	
	
}


/*

Write a program that can remove duplciated characters from a string
	ex:
	    str = "aaaabbbbbbcccccccccdddd"
	    
	    output:
	        abcd

*/