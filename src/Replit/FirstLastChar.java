import java.util.Arrays;
import java.util.Scanner;

public class FirstLastChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		// TODO: Write your code below
		String[] newArr=new String[5];
		for (int i = 0; i < words.length; i++) {
			newArr[i]=words[i].substring(0, 1).concat(words[i].substring(words[i].length()-1));

		}
		System.out.println(Arrays.toString(newArr));
	}
}