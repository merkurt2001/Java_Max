import java.util.Arrays;
import java.util.Scanner;

public class ZombiAttack1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.
		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		while (!Arrays.stream(inhabitants).allMatch(x -> x == 0)) {
			for (int j = 0; j < inhabitants.length; j++) {
				inhabitants[j] /= 2;
			}
			day++;
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		}

		System.out.println("---- EXTINCT ----");
	}
}