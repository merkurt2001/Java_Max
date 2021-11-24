package Reviews.EU6_review.week14;

public final class Tester extends Employee { // Tester Is An Employee

	public Tester(String name, char gender, int age, String jobTitle, double salary) {
		super(name, gender, age, jobTitle, salary);
	}

	@Override
	public void work() {
		System.out.println( getName()+" is testing" );
	}
	
	public void findBugs() {
		System.out.println(getName()+" found a bug");
	}
	

}
