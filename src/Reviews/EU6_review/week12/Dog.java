package Reviews.EU6_review.week12;

public class Dog {
	
	public String name;
	public String breed;
	public char gender;
	public int age;
	
	public Dog(String name, String breed, char gender, int age) { //allows us to set all the instance of the dog when the object is created
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
	}
	
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	public void bark() {
		System.out.println(name+" is barking");
	}


	
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	


}

/*
Dog:
Attributes (instance variables):
	name, breed, age, gender

Action (instance methods):
	eat(), drink(), sleep(), bark()

*/