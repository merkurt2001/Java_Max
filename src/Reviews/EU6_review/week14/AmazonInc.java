package Reviews.EU6_review.week14;

public class AmazonInc { // Amazon Has A Tester
	
	public static void main(String[] args) {
		Tester tester = new Tester("Selami", 'M', 25, "SDET", 100000);
		tester.setJobTitle("Quality Engineer");
		tester.setAge(-9);
		
		
		Developer developer = new Developer("Annie", 'F', 28, "Java Developer", 110000);
		developer.setSalary(115000);
		
		Teacher teacher = new Teacher("Asiya", 'F', 24, "Softskill teacher", 110000);
		
		Driver driver = new Driver("John", 'M', 32, "Truck Driver", 950000);
		
		
		System.out.println(tester);
		System.out.println(developer);
		System.out.println(teacher);
		System.out.println(driver);
		
		System.out.println("-------------------------------------------");
		
		tester.work();
		developer.work();
		teacher.work();
		driver.work();
		
		tester.findBugs();
		//developer.findugs();
		//teacher.findugs();
		//driver.findugs();
		
		
		
		
	}

}
