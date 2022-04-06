package groupStudies.GroupStudies.Constructor;

class Vowl {
    public char var;
}

public class ConstExample3 {
    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;

        Vowl obj1 = new Vowl();
        Vowl obj2 = obj1;

        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);

    }
}
