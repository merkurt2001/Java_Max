package weeklyMeeting.GroupStudies.StaticKeyWord;

public class OrderDriver {
    public static void main(String[] args) {
        new Order();
        new Order();
        System.out.print(Order.result + " ");//ucrcr
        System.out.print(Order.result + " ");//ucrcr

        System.out.print(Order.result + " ");//ucrcr
    }
}

class Order {
    static String result = ""; //ucrcr

    {
        result += "c";
    }

    static {
        result += "u";
    }

    {
        result += "r";
    }
}
