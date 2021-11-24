package groupStudies.EU6_Groups.package1;

public class debuggingExample {

	public static void main(String[] args) {

		/*
		 * The purpose of the debugger is to interfere with the program
		 * execution and provide you with the information on what’s happening under the
		 * hood. This facilitates the process of detecting and fixing bugs in your
		 * program.
		 */

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		a = b;
		a++;
		b += c;
		d = e;
		b += e;
		e = c;
		a = b;
		a-=d;
		if (a<e) {
			a+=e;
		}else {
			a+=(++d);
		}

		System.out.println(a);
		

	}

}
