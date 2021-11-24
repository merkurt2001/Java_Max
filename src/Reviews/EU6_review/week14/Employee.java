package Reviews.EU6_review.week14;

public class Employee{
	
	private String name;
	private final char gender;
	private int age;
	private String jobTitle;
	private double salary;
	
	public static boolean hasJob ;
	
	static {
		hasJob = true;
	}
	

	public Employee(String name, char gender, int age, String jobTitle, double salary) {
		setName(name);
		this.gender = gender;
		setAge(age);
		setJobTitle(jobTitle);
		setSalary(salary);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<= 0) {
			System.err.println("Age cannot be negative or zero");
			return;
		}
		
		if(age < 18) {
			System.err.println("Age of the employee at least has to be 18");
			return;
		}
		
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary <0) {
			return;
		}
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}
	
	
	public void work() {
		System.out.println(name+" is working");
	}

	
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", jobTitle=" + jobTitle + ", salary="
				+ salary + "]";
	}
	
	
	

}
