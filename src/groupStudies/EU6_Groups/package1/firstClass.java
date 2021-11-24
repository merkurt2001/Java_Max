package groupStudies.EU6_Groups.package1;

import java.text.DecimalFormat;

public class firstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num=3.1487549837498327489;
		
		DecimalFormat dc= new DecimalFormat("0.000");
		System.out.println(dc.format(num));
		
		int a,b,c;
		a=10;
		b=20;
		c=a; // c=10 a=10
		System.out.println(a);
		a=b; // a=20;
	
		System.out.println(c);
		System.out.println(a);
		
		c=a; //c=20
		System.out.println(c);
		
		System.out.println (1 + 25 + 2 + "aws"); //28aws
		System.out.println(1 + "aws" + (2 + 4)); //1aws6
		System.out.println("aws" + 1 + 2 + 3); //aws123
		System.out.println('a' + 'w' + 's'); // 331 A=65
		System.out.println('w' + " " + 's'); // w s
		System.out.println('a' + "" + 's'); // as
		System.out.println('w' + 's'); // 234
		
		

	}

}
