package assignment.assignment8;

public class Question13 {

	public static void main(String[] args) {
		System.out.println(waterTax(50));
		System.out.println(waterTax(55));
		System.out.println(waterTax(101));
		System.out.println(waterTax(151));
	}

	public static double waterTax(double units) {
		double bill = 0.0;

		// your code here
		if (units <= 50) {
			bill = units * 0.60;
		} else if (units < 100) {
			bill = units * 0.90;
		} else if (units < 150) {
			bill = 50 + units * 0.90;
		} else {
			bill = units * 0.90 + 100;

		}
		return bill;
	}
}
