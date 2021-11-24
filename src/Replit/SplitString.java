import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {

		String info1[] = info.split(",");// slash
		System.out.println("person name: " + info1[0] + " last name : " + info1[1] + " age :" + info1[2]);

	}

}// girilen ifadeyi , den par�alar
