package groupStudies.EU6_Groups.polymorphism;

public class Zoo {

	public static void main(String[] args) {

		Dog rover = new Dog();
		rover.fetch();
		rover.makeSound();
		feed(rover);
		rover.sleep();
		System.out.println("=====================");

		Animal sasha = new Dog();
		sasha.makeSound();
		feed(sasha);
		sasha.sleep();

		((Dog) sasha).fetch();// down casting
		System.out.println("=======================");

		sasha = new Cat();
		sasha.makeSound();
		feed(sasha);
		sasha.sleep();
	}

	public static void feed(Animal animal) {
		if (animal instanceof Dog) {
			System.out.println("here's your dog food");
		} else if (animal instanceof Cat) {
			System.out.println("here's your cat food");
		}

	}

}
