package groupStudies.GroupStudies.Constructor;

class FieldInit{
    char c;
    boolean b;
    float f;

    void printAll(){
        System.out.println("c = " + c);
        System.out.println("b = " + b);//false
        System.out.println("f = " + f);//0.0
    }
}
public class ConstExample1 {
    public static void main(String[] args) {
        FieldInit f= new FieldInit();
        f.printAll();
        f.b=true;
    }
}
