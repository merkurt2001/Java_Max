package assignment.assignment8_methods;

public class Question14 {

	public static void main(String[] args) {
		
		System.out.println(threeLocks(true,true,true));
		System.out.println(threeLocks(true,false,true));
		System.out.println(threeLocks(true,false,false));
		

	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		    
		if((a && b) || c){
		  return true;
		}else{
		  return false;
		}
		      
	}

}
