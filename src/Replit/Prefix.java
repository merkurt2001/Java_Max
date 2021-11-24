import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    String prefix=str.substring(0, n);
	    String remaining=str.substring(n);
	    System.out.println(remaining.contains(prefix));
	  }
}
