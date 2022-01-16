package groupStudies.EU7_Groups.polymorphism;

public class Animal {

	public void makeSound() {
		System.out.println("animal sound");
	}

	public void sleep() {
		System.out.println("....sleeping");
	}

}

class Dog extends Animal {

	public void makeSound() {
		System.out.println("wooof");
	}

	public void fetch() {
		System.out.println("fetch is fun");
	}

}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("meow");
	}

	public void scratch() {
		System.out.println("I scratch things");
	}
}
