import java.util.Scanner;

public class ParseJson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();

		int firstnameStartingIndex = json.indexOf("first") + 13;
		int firstnameEndingIndex = json.indexOf("\"", firstnameStartingIndex);
		System.out.println("First name: "+json.substring(firstnameStartingIndex, firstnameEndingIndex));

		int lastnameStartingIndex = json.indexOf("last") + 12;
		int lastnameEndingIndex = json.indexOf("\"", lastnameStartingIndex);
		System.out.println("Last name: "+json.substring(lastnameStartingIndex, lastnameEndingIndex));
		
	}
}