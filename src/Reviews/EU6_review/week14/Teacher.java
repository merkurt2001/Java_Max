package Reviews.EU6_review.week14;

public final class Teacher extends Employee{ // Teacher Is An Employee

	public Teacher(String name, char gender, int age, String jobTitle, double salary) {
		super(name, gender, age, jobTitle, salary);
	}

	@Override
	public void work() {
		System.out.println(getName()+" is teaching");
	}
	


}