package weeklyMeeting.GroupStudies.StaticKeyWord;

public class OrderDriver2 {
    public static void main(String[] args) {
        Order1 order = new Order1("f");
        order = new Order1();
        System.out.println(order.value);
    }

}

class Order1 {
    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order1() {
        value += "b";
    }

    public Order1(String s) {
        value += s;
    }
}
