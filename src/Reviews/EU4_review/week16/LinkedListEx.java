package Reviews.EU4_review.week16;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(5);
        list1.add(-10);
        list1.add(32);
        list1.add(5);

        System.out.println(list1);
        list1.getFirst();
        list1.peekFirst();

    }
}
