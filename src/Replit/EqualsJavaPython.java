import java.util.Scanner;

public class EqualsJavaPython {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int pythonCount = 0;
		int javaCount = 0;

		for (int i = 0; i < sentence.length() - 4; i++) {
			if (sentence.substring(i, i + 4).equals("java")) {
				javaCount++;
			}
		}
		for (int i = 0; i < sentence.length() - 6; i++) {
			if (sentence.substring(i, i + 6).equals("python")) {
				pythonCount++;
			}
		}
		System.out.println(javaCount == pythonCount);
	}
}
