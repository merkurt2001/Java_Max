package assignment.assignment14_oop;

public class Question11 {

	public static void main(String[] args) {
	
		 SavingsAccount savingsAccount = new SavingsAccount(2.3);
	
	}

}

class BankAccount{
	
}

class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingsAccount(double interestRate) {
		this.interestRate=interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
}
