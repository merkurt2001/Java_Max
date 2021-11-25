package assignment.assignment9_mix;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    int size = word.length();
		    
		if(size%2 !=0) {
		    if(size >=3) {
		    	System.out.println(word.charAt(size/2));
		    }else{
		    	System.out.println(word.concat(word).concat(word));
		    }
		}else{
		    if (size>=4) {
		    	System.out.println(word.substring(size/2-1, size/2+1));
		    }else{
		    	System.out.println(word.concat(word));
		    }
		}
	}

}
