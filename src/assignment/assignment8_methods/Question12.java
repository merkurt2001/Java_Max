package assignment.assignment8_methods;

public class Question12 {

	public static void main(String[] args) {
		
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(false, false));
		

	}
	
	public static boolean hamletQuote(boolean toBe,boolean notToBe){
	    if(toBe||notToBe)
	      return true;
	    else
	      return false;
	}

}
