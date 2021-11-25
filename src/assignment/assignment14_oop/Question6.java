package assignment.assignment14_oop;

public class Question6 {

	public static void main(String[] args) {
		
		ParkingMeter p=new ParkingMeter(25);
		System.out.println(p.add(20));

	}

}

class ParkingMeter{
	
	private int timeLeft=0;
	private int maxTime;	
	
	public ParkingMeter(int maxTime) {
		this.maxTime=maxTime;
	}
	
	public boolean add(int a) {
		if (a == 25) {
			if (timeLeft < maxTime) {
				timeLeft += 30;
				return true;
			}
			else 
				return false;
		}
		else {
			return false;
		}
	}
	
	public void tick() {
		if(timeLeft>0) {
			timeLeft--;
		}
	}	
	
	public boolean isExpired() {
		if(timeLeft==0) {
			return true;
		}
		return false;
	}

}
