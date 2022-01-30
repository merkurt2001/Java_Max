package lambda.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        //System.out.println(getSumFrom7To100());
        //System.out.println(getSumFrom7To10001());
        //System.out.println(getSumFrom7To10002());
        //System.out.println(getMultipleFrom2To11());
        //System.out.println(getFactorial());
        //System.out.println(getFactorial(-6));
        //System.out.println(getFactorial01(-6));
        // System.out.println(getFactorial02(-6));
        //  System.out.println(sumOfGivenTwoEvenNumber(2,6));
        //System.out.println(sumOfGivenTwoEvenNumber01(11,7));
        System.out.println(sumOfSquareOfEvenNumbers(l));
        sumOfSquareOfEvenNumbers01(l);

    }

    // find the sum of integers from 7 to 100
    public static int getSumFrom7To100() {
        return IntStream.range(7, 101).sum();

    }

    //IntStream().range() does the same like for loop
    public static int getSumFrom7To10001() {
        // return IntStream.range(7,101).reduce(0,(t,u)-> t+u);
        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }

    //IntStream().rangeClosed() does the same like for loop
    public static int getSumFrom7To10002() {
        // return IntStream.range(7,101).reduce(0,(t,u)-> t+u);
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    public static int getMultipleFrom2To11() {
        //   return IntStream.rangeClosed(2,11).reduce(1,(t,u)-> t*u);
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

    public static int getFactorial() {  // 5*4*3*2*1
        return IntStream.rangeClosed(1, 5).reduce(1, Math::multiplyExact);
    }

    public static int getFactorial(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        } else {

            System.out.println(" Do not use negative number");
            return 0;
        }

    }

    public static int getFactorial01(int x) {

        return x > 0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : -1;

    }

    public static Object getFactorial02(int x) {

        return x > 0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : " No negative number";

    }

    public static int sumOfGivenTwoEvenNumber(int x, int y) {
        return IntStream.rangeClosed(x, y).filter(Utils::checkToBeEven) //sum();
                .reduce(0, Math::addExact);
    }

    public static int sumOfGivenTwoEvenNumber01(int s, int e) {

        int x = 0;
        if (s > e) {
            x = s;
            s = e;
            e = x;

        }
        return IntStream.rangeClosed(s, e).filter(Utils::checkToBeEven) //sum();
                .reduce(0, Math::addExact);
    }

    public static int sumOfSquareOfEvenNumbers(List<Integer> list) {
        return list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
    }

    public static void sumOfSquareOfEvenNumbers01(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println("sum = " + sum);
    }
}

