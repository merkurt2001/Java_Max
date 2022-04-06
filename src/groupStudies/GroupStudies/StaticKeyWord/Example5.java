package groupStudies.GroupStudies.StaticKeyWord;

class Test2 {
    int x, y;

    public Test2(int x, int y) {
        initilize(x, y);
    }

    public void initilize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }
}

public class Example5 {
    public static void main(String[] args) {
        int x = 3, y = 5;
        Test2 obj = new Test2(x, y);
        System.out.println(x + " " + y);
    }
}
