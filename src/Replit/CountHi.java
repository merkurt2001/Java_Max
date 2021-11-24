import java.util.Scanner;

public class CountHi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		for (int i = 0; i <= str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals("hi"))

				count++;
		}
		System.out.println(count);
	}
}