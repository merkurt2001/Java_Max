package groupStudies.EU7_Groups.package1;

public class ThirdClass {

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

	}

}
