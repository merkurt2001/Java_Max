import java.util.Scanner;

public class WithoutEnd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String txt = s.next();
		// your code here
		String str = txt.substring(0, txt.length() - 1);
		System.out.println(str);
	}
}
