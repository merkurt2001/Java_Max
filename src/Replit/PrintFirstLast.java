import java.util.Scanner;

public class PrintFirstLast {

	public static void main(String[] args) {
		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		System.out.println(word.substring(0, 1).concat(word.substring(word.length()-1)));
	}
}