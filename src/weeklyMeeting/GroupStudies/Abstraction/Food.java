package weeklyMeeting.GroupStudies.Abstraction;

public abstract class Food extends Object { //can extend to other classes (abstract or non-abstract)


    //- Abstract Classes can use all access modifiers with variables and methods
    String name;
    public static int amount;
    public final boolean EDIBLE = true;
    protected int quantity;
    boolean isSpicy;
    private boolean isTasty;


    public Food(){//constructor
        //code
    }
    public abstract void eat(); //void eat(); - > it will not work
    //abstract classes and methods can not be private (not inherited) or final (never overridden)
    //Does not have implementation (without curly braces)
    //can only be declared in 'abstract classes' or 'interfaces'
    //Method overriding' rules apply to implement abstract methods
    //First concrete class (subclass of abstract class or interface) must
    //implement all inherited abstract methods

    public void serve(){  //instance method
        //code
    }

    public static void buy(){ //static method
        //code
    }

    public static void main(String[] args) { //can have main method
        //Food obj = new Food(); //but can not create obj
    }

    static { //static blok
        //code
    }
    {
        //instance blok
    }


}
