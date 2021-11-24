package Reviews.EU6_review.week13;

public class EmployeeObjects {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("John", "SDET",95000);
		Employee employee2 = new Employee("Matt", "Developer",110000);
		Employee employee3 = new Employee("Aaron", "Scrum Master",100000);

		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		System.out.println(Employee.colors);
		
		System.out.println(employee1.hasJob);
		System.out.println(Employee.hasJob);
		
	}

}
