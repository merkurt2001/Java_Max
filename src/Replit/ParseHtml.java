import java.util.Scanner;

public class ParseHtml {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		if (html.contains("<html>")) {
			int id = html.indexOf("id=");
			int begin = id + 4;
			int end = html.indexOf("\"", begin);
			System.out.println(html.substring(begin, end));
		} else {
			System.out.println("Invalid input");
		}
	}
}
