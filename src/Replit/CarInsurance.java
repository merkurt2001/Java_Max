import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		int zipCode;
		int age;
		int yearsOfExperience;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		String haveDriverLicense;
		String haveAccident;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		haveDriverLicense = scan.nextLine();
		if (haveDriverLicense.contentEquals("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (haveDriverLicense.contentEquals("Yes")) {
			System.out.println("Enter your zip code");
			zipCode = scan.nextInt();
			if (zipCode == 20910 || zipCode == 20740) {
				premium = premium + 60;
			} else if (zipCode == 22102 || zipCode == 22103) {
				premium = premium + 30;
			} else {
				premium = premium + 50;
			}
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.next();
			if (vehicleOwnership.contentEquals("Owned")) {
				premium = premium + 10;
			} else {
				premium = premium + 20;
			}
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.next();
			if (vehicleUsage.contentEquals("Business")) {
				premium = premium + 50;
			} else if (vehicleUsage.contentEquals("Pleasure")) {
				premium = premium + 10;
			} else if (vehicleUsage.contentEquals("Commute")) {
				premium = premium + 20;
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool = scan.nextInt();
				premium = premium + 5 * daysDrivenToWorkOrSchool;
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool = scan.nextInt();
				premium = premium + 1 * milesToWorkOrSchool;
			}
			System.out.println("How old are you?");
			age = scan.nextInt();
			if (age < 16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else if (age >= 16 && age < 18) {
				premium = premium * 20;
			} else if (age >= 18 && age <= 21) {
				premium = premium * 6;
			} else if (age >= 21 && age < 25) {
				premium = premium * 2;
			}
			System.out.println("How many years you've been driving?");
			yearsOfExperience = scan.nextInt();
			if (yearsOfExperience <= 0 || age - yearsOfExperience < 16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else {
				premium = premium - yearsOfExperience * 5;
			}
			System.out.println("Have you had any accidents in the last 5 years?");
			haveAccident = scan.next();
			if (haveAccident.equalsIgnoreCase("Yes")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				premium = premium + accidentsAmount * premium * 20 / 100;
			} else {
				premium = premium;
			}
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();
			if (continuousInsurance.contentEquals("No")) {
				premium = premium * 2;
			} else {
				premium = premium;
			}
			System.out.println("What is the highest level of education you have completed?");
			scan.nextLine();
			education = scan.nextLine();
			if (education.contentEquals("PhD") || education.contentEquals("Bachelors")
					|| education.contentEquals("Masters")) {
				premium = premium * 95 / 100;
			} else if (education.contentEquals("Doctors")) {
				premium = premium * 90 / 100;
			} else if (education.contentEquals("Less than High School")) {
				premium = premium * 105 / 100;
			}
			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $" + premium);
			referenceNumber = name.substring(0, 2) + "" + age + name.substring(name.length() - 2) + "" + zipCode
					+ education.replace(" ", "");
			String referenceNumber1 = referenceNumber.toUpperCase();
			System.out.println("Reference number: " + referenceNumber1);
		}
	}
}