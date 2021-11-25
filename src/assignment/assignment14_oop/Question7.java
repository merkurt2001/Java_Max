package assignment.assignment14_oop;

public class Question7 {

	public static void main(String[] args) {
	     
		GasTank g=new GasTank(20);
		g.addGas(5);
		System.out.println(g.getGasLevel());
	
	}
}

class GasTank {

	double amount =0;
	double capacity;
		
	public GasTank(double capacity) {
		this.capacity=capacity;
	}
		
	public void addGas(double a) {
		amount+=a;
		if(amount>capacity) {
			amount=capacity;
		}
	}
		
	public void useGas(double b) {
		amount-=b;
		if(amount<0) {
			amount=0;
		}
	}
		
	public boolean isEmpty() {
		if(amount< 0.1) {
			return true;
		}
		return false;
	}
		
	public boolean isFull() {
		if(amount>(capacity-0.1)) {
			return true;
		}
		return false;
	}
		
	public double getGasLevel() {
		return amount;
	}
		
	public double fillUp() {
		double amountBefore=amount;
		amount=capacity;
		return (capacity-amountBefore);
	}
	  
}
