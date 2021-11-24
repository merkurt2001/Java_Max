package Reviews.EU6_review.week12;

public class EmployeeObjects {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Furkan", 'M', 28, 11, "SDET", 90000);
		Employee employee2 = new Employee("Annie", 'F', 25, 12, "QE", 95000);


		System.out.println(employee2);
		System.out.println(employee1);
		
		employee1.work();
		employee2.attendmeeting();
		
		
	}

}
