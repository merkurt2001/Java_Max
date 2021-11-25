package assignment.assignment4_selectionStatements;

public class Question8 {

	public static void main(String[] args) {
		
		int numberPackages=180;
		int packagePrice=5;
		double discount=0,total=0;
		int subTotal=0;
		
		if(numberPackages<10) {
			subTotal=packagePrice*numberPackages;
			discount=0;
			total=subTotal-discount;
		}else if(numberPackages<20) {
			subTotal=packagePrice*numberPackages;
			discount=0.2*subTotal;
			total=subTotal-discount;
		}else if(numberPackages<50) {
			subTotal=packagePrice*numberPackages;
			discount=0.3*subTotal;
			total=subTotal-discount;
		}else if(numberPackages<100) {
			subTotal=packagePrice*numberPackages;
			discount=0.4*subTotal;
			total=subTotal-discount;
		}else if(numberPackages>100) {
			subTotal=packagePrice*numberPackages;
			discount=0.5*subTotal;
			total=subTotal-discount;
		}
		
		System.out.println("SubTotal is " + subTotal);
		System.out.println("Discount is " + (int)discount);
		System.out.println("Total amount of the purchase after discount is  " + (int)total);

	}

}
