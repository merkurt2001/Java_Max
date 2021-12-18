package groupStudies.EU7_Groups.StaticKeyWord;

public class StaticTest {
    int p;
    private int q;
    protected int r;
    public int s;
    public static void main(String[] args) {

        StaticGeneral obj1 = new StaticGeneral();
        obj1.x =10;
        obj1.y = 20;
        System.out.println("obj1.x = " + obj1.x);
        System.out.println("StaticGeneral.y = " + StaticGeneral.y);
        System.out.println("obj1.y = " + obj1.y);

        StaticGeneral obj2 = new StaticGeneral();
        obj2.y =50;

        System.out.println(obj1.y);
        System.out.println(obj2.y);

        obj1.instanceMethod();
        obj1.staticMethod();
        StaticGeneral.staticMethod();
    }
}
