package groupStudies.Test;

public class Animal {
    public void makeSound(){
        System.out.println("Animal sound");
    }
    public void sleep(){
        System.out.println("...sleeping");
    }

}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("woof");
    }
    public void fetch(){
        System.out.println("fetching is fun");
    }

}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow");
    }
    public void scratch(){
        System.out.println("cat is scrathing");
    }

}