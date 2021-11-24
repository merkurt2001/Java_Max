package Reviews.EU7_review.week4;

public class BankAccount {
	
	String accountHolderName;
	int pin;
	double balance;
	long accountNumber;
	
	public double getBalance(int inputPin) {
		if(pin==inputPin) {
			return balance;
		}
		return -1;
	}
	

}
