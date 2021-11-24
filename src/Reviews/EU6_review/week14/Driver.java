package Reviews.EU6_review.week14;

public final class Driver extends Employee { // Driver Is An Employee

	public Driver(String name, char gender, int age, String jobTitle, double salary) {
		super(name, gender, age, jobTitle, salary);
	}

	@Override
	public void work() {
		System.out.println(getName()+" is driving");
	}
	
	

}
