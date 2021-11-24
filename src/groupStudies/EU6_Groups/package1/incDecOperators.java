package groupStudies.EU6_Groups.package1;

public class incDecOperators {

	public static void main(String[] args) {

		int a = 100;
		a -= 20 * 2;
		System.out.println(a);

		int x = 4;
		System.out.println(++x * 2 - x++);
		// 5*2 5 =5
		System.out.println(x);

//		int x = 1;
		System.out.println((x > 4) && (++x == 4)); // false
		System.out.println(x); // x=1
		System.out.println((x > 4) & (++x == 4)); // false
		System.out.println(x); // x=2
//		ctrl+/

//		int x = 1;
		System.out.println((x > 0) || (++x == 4)); // true
		System.out.println(x); // x=1
		System.out.println((x > 0) | (++x == 4)); // true
		System.out.println(x); // x=2

	}

}
