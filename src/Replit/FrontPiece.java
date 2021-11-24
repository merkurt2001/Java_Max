import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE
		int newsize;
		if (size<=2) {
			newsize=size;
		}else {
			newsize=2;
		}
		int[] newArray=new int[newsize];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=num[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
}