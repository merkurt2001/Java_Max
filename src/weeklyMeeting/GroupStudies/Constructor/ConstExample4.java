package weeklyMeeting.GroupStudies.Constructor;

class MyField {
    int x, y;

    public void doStuff(int x, int y) {
        this.x = x;
        y = this.y;
    }
    public void display() {
        System.out.println(x + " " + y + " : ");
    }
}

public class ConstExample4 {
    public static void main(String[] args) {

        MyField m1= new MyField();
        m1.x=100;
        m1.y=200;

        MyField m2=new MyField();
        m2.doStuff(m1.x,m1.y);
        m1.display();
        m2.display();

    }
}
