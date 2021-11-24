import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.
		int i = 0;
		while (decimal > 0) {
			// storing remainder in binary array
			binary[i] = decimal % 2;
			decimal = decimal / 2;
			i++;
		}

		// printing binary array in reverse order
		int[] newbinary=new int[8];
		int x=0;
		for (int j = 7; j >= 0; j--) {
			newbinary[x] = binary[j];
			x++;
		}
		System.out.println(Arrays.toString(newbinary));
		
	}
}
