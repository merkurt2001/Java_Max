package weeklyMeeting.GroupStudies.Abstraction;

public abstract class Food {
     //- Abstract Classes can use all access modifiers with variables and methods
    String name;
    public static int amount;
    public final boolean EDIBLE = true;
    protected int quantity;
    boolean isSpicy;
    private boolean isTasty;


    public abstract void eat();  //void eat(); - > it will not work

    public Food(String name) {
        this.name = name;
    }

    public void serve(){  //instance method
        //code
    }

    public static void buy(){ //static method
        //code
    }

}
