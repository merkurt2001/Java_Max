package groupStudies.EU6_Groups.package3;

import java.text.DecimalFormat;

public class PrintF {

	public static void main(String[] args) {

		int value = 10;

		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= value; j++) {
				int result = i * j;
				System.out.printf("%4d", result); //

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("=========================");
		
		double x =3.1434309384433;
		System.out.printf("%.2f",x);
		
		System.out.println();
		System.out.println("=========================");
		
		DecimalFormat dc = new DecimalFormat("0.00");
		System.out.println(dc.format(x));
		
		System.out.println();
		System.out.println("=========================");
		
		System.out.printf("'%S' %n","cybertek");
		
		System.out.println();
		System.out.println("=========================");
		
		System.out.printf("%2.6s","Hi are you there");

	}

}
