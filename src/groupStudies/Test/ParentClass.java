package groupStudies.Test;

public class ParentClass {


    public ParentClass display() {
        System.out.println("parent class");
        return new ParentClass();
    }


}

class ChildClass extends ParentClass {

    public ChildClass display() {
        System.out.println("child class");
        return new ChildClass();
    }

}

