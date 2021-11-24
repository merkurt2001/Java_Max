package Reviews.EU6_review.week13;

import java.util.ArrayList;


public class Employee {
	
	public String name;
	public String jobTitle;
	public double salary;
	
	public static boolean hasJob = true ;
	
	public static ArrayList<String> colors ;
		
	
	public void work() {
		System.out.println(name+" is working");
	}
	
	public static void hasJob() {
		System.out.println(hasJob);
	}
	
	
	static {
	//	name = "John";
		hasJob = true;
		colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
	}
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	
	}

	
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}
	
	
	

}
