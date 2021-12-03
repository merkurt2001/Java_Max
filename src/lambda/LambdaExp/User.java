package lambda.LambdaExp;

public class User {
	
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
