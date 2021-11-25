package assignment.assignment14_oop;

public class Question9 {

	public static void main(String[] args) {
		
		Telephone telephone = new Telephone();
		telephone.setNumber("3000");
		System.out.println(Telephone.total);

	}

}

class Telephone{
	
	  String number;
	  public static int quantity=250;
	  public static double total=15658.92;
	  
	  public String getNumber(){
	    return this.number;
	  }
	  
	  public void setNumber(String number){
	    this.number=number;
	  }

}