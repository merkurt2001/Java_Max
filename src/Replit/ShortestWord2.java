import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] words = str.split(", ");

		String shortestWord = words[0];
		for (String currentWord : words) {
			if (currentWord.length() < shortestWord.length()) {
				shortestWord = currentWord;
			}
		}
		String allShorts = "";
		for (String currentWord : words) {
			if (currentWord.length() == shortestWord.length()) {
				allShorts += currentWord + ",";
			}
		}
		allShorts = allShorts.substring(0, allShorts.length() - 1);
		String[] shortestWordArray = allShorts.split(",");

		Arrays.sort(shortestWordArray);
		System.out.println(Arrays.toString(shortestWordArray));
	}
}