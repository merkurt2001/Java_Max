package groupStudies.Test;

public class Zoo {
    public static void main(String[] args) {
        Dog rover= new Dog();
        rover.fetch();
        rover.makeSound();
        rover.sleep();

        Animal sasha=  new Dog();
        sasha.makeSound();
        sasha.sleep();
        ((Dog)sasha).fetch();

        sasha= new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();



    }
}
