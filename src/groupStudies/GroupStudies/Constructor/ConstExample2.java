package groupStudies.GroupStudies.Constructor;

class Test {
    int x, y;

    public Test(int x, int y) {
        initilize(x, y);
    }
    private void initilize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }
}
public class ConstExample2 {
    public static void main(String[] args) {
        int x = 3, y = 5;
        Test obj = new Test(x, y);
        System.out.println(x + " " + y);

    }
}
