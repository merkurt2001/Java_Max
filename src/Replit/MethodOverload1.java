import java.util.Scanner;

public class MethodOverload1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size");
		int size = scan.nextInt();
		int[] nums = new int[size];
		double[] nums1=new double[size];
		System.out.println("Enter "+size+" of integer");
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Enter "+size+" of double");
		for (int i = 0; i < size; i++) {
			nums1[i] = scan.nextDouble();
		}
		System.out.println(findMax(nums));
		System.out.println(findMax(nums1));
	}

	public static double findMax(double[] number) {
		double dummy = 0.0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > dummy) {
				dummy = number[i];
			}
			
		}
		return dummy;
		
	}

	public static int findMax(int[] number) {
		int dummy = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > dummy) {
				dummy = number[i];
			}
			
		}
		return dummy;
		
		
	}

}
