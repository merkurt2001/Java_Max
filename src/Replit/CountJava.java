import java.util.Scanner;

public class CountJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String newStr=word.replaceAll("java", "");
	    System.out.println((word.length()-newStr.length())/4);

	}

}
