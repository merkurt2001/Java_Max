package assignment.assignment6_forLoop;

public class Question9 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) { //outer loop to print 8 rows
		    
		    for(int j = 1; j <= 8; j++) { //inner loop to print 8 columns in each row
		    	
		        if ((i + j) % 2 != 0) {
		        	
		            System.out.print("B" + " "); //Print B when sum of i + j is odd
		            
		        } else {
		        	
		        	System.out.print("W" + " "); //Print W when sum of i + j is even
		        	
		        }
		        
		    } //inner for ends
		    
		    System.out.println(); //New line at the end of each row
		    
		} //outer for ends

	}

}
