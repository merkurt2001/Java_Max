package groupStudies.EU7_Groups.StaticKeyWord;

class Test {
    public static int stVar = 100;
    public int var = 200;

    public String toString() {
        return var + " :" + stVar;
    }
}

public class Example2 {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.var = 300;
        System.out.println(t1);

        Test t2 = new Test();
        t2.stVar = 300;
        System.out.println(t2);

    }
}
