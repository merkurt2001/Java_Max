package assignment.assignment9_mix;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
	    double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
	    
	    // 1. ask name
		System.out.println("Enter your name:");
		name = scan.nextLine();
		
		// 2. ask own license or not?
		System.out.println("Do you have a US driver license?");
		String ownLicense = scan.next();

		// if no exit, else continue
		if (ownLicense.equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		// 3. ask zip code
		System.out.println("Enter your zip code");
		int zipCode = scan.nextInt();

		if (zipCode == 20910 || zipCode == 20740) {
			premium += 60;
		}else if(zipCode == 22102 || zipCode == 22103) {
			premium += 30;
		}else{
			premium += 50;
		}

		// 4. ask car ownership
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();

		if (vehicleOwnership.equalsIgnoreCase("owned")) {
			premium += 10;
		}else{
			premium += 20;
		}

		// 5. ask car usage
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();

		if (vehicleUsage.equalsIgnoreCase("business")) {
			premium += 50;
		}else if(vehicleUsage.equalsIgnoreCase("pleasure")) {
			premium += 10;
		}else if(vehicleUsage.equalsIgnoreCase("commute")) {
			premium += 20;

			// 6. ask user how many days per week user drives to work
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();

			premium = premium + daysDrivenToWorkOrSchool * 5;

			// 7. ask user about how many miles customers drives to work or school
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();

			premium = premium + milesToWorkOrSchool * 1;
		}

		// 8. ask customer about his age
		System.out.println("How old are you?");
		int age = scan.nextInt();

		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else if(age >= 16 && age < 18) {
			premium = premium * 20;
		}else if(age >= 18 && age <= 21) {
			premium = premium * 6;
		}else if(age > 21 && age < 25) {
			premium = premium * 2;
		}

		// ask customer about driving experience
		System.out.println("How many years you've been driving?");
		int yearDriving = scan.nextInt();

		if (!(yearDriving > 0) && !((age - yearDriving) >= 16)) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else{
			premium = premium - yearDriving * 5;
		}

		// ask customer about car accidents

		System.out.println("Have you had any accidents in the last 5 years?");
		String checkAccident = scan.next();

		if (checkAccident.equalsIgnoreCase("yes")) {
			// ask customer about amount of accidents
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + premium * 0.20 * accidentsAmount; // Add 20% to the premium price for every accident
		}

		// ask customer if he had continuous insurance for the past 12 months
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();

		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium = premium * 2;
		}

		scan.nextLine();

		// ask user about level of education

		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();

		if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Masters") || education.equalsIgnoreCase("Bachelors")) {
			premium = premium - premium * 0.05;
		}else if(education.equalsIgnoreCase("Doctors")) {
			premium = premium - premium * 0.10;
		}else if(education.equalsIgnoreCase("Less than High School")) {
			premium = premium + premium * 0.05;
		}

		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);

		education = education.replace(" ", "");
		referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode + education;
		referenceNumber = referenceNumber.toUpperCase();

		System.out.println("Reference number: " + referenceNumber);

	}

}
