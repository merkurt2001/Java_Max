package groupStudies.GroupStudies.Strings;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * @author Maximilian (to create JAVADOC Comment--- alt+shift+j)
 *
 * printF-- an advance command for printing formatted text
 * syntax--- System.out.printf("formating string", parameters)
 *  A format string contains placeholder to insert into it
 *  
 *  During test cases when getting value from browser we can format
 *  the DATA using printf method.
 *  
 */


public class PrintF {

	public static void main(String[] args) {

		int value = 10;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= value; j++) {
				int result = i * j;
//				System.out.print(result);
				System.out.printf("%4d", result); // how can we get formatted output?
			}
			System.out.println();
		}

		System.out.println("==============");

		System.out.printf("%16f", 5.0); // f--a floating point value, 16 characters wide, right aligned
		System.out.println();
		System.out.printf("%-4d", 2); // d--an integer, 4 characters wide, - left aligned
		System.out.println();
		System.out.printf("%.3f",3.5173465922); // f--a floating point value, 2 digit after decimal
		System.out.println(); 
		System.out.printf("%c",'a'); // c--a char, lower case
		System.out.println(); 
		System.out.printf("%C",'a'); // C---a char, UPPER case
		System.out.println();
		System.out.printf("%B",5<4); // B---boolean, UPPER case
		System.out.println();
		System.out.println("=========================");

		System.out.printf("'%s' %n", "CyberTek"); // a String value, lower case
		System.out.printf("'%S' %n", "CyberTek"); // a String , UPPER CASE

		System.out.println();
		System.out.println("=========================");

		
		System.out.printf("%.4s", "1-48 of over 6,000 results"); // to limit the number of 
		System.out.println();								//characters in our output  (to get 4 char)
		System.out.println("=========================");

		System.out.printf(Locale.US, "%,d %n", 5000); // format our results for different locales
		System.out.printf(Locale.ITALY, "%,d %n", 10000);
		System.out.printf(Locale.US, "nine".toUpperCase()); // ex: Turkish keyboard result might be "NİNE"
															//your test case might fail
			
		System.out.println();
		System.out.println("=========================");
		
		double PI = 3.14159265359;
		
		System.out.printf("'%8.4f", PI); // control the precision

		System.out.println();
		System.out.println("=========================");

		DecimalFormat dc = new DecimalFormat("0.0000"); // another option to control precision 
		System.out.println(dc.format(PI));			//we can use Decimal Class

	}
}
