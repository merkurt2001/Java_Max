package groupStudies.EU8_Groups.firstWeek;

public class TypeCasting {
    public static void main(String[] args) {
        	/* Type Casting exercise

	byte → short → int → long → float → double----Widening conversion (smaller to bigger)

	double→ float → long → int → char → short → byte----Narrowing or Explicit Conversion (bigger to smaller) */

        byte b = 126;
        long l = 44444444L;
        double y = 200;
        float f = (float) y;
        float fit = 200.33f;

        int x = (int) (b + l + f);
        float ft = b + l + f;

        double bd = 100l;
        double db = 100f;

        System.out.println((int)(7.9)+(int)(6.7));//13
        System.out.println((int)(7.9+6.7));//14
        System.out.println((double)(17));//17.0
        System.out.println((double)(8+3));//11.0
        System.out.println((double)(7)/2);//3.5
        System.out.println((double)(7/2));//3.0
        System.out.println((int)(7.8+(double)(15)/2));//15

    }
}
