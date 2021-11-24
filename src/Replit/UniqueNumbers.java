import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);

	}

	public static void printUniqueNumbers(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (isEqual(nums, nums[i]) == 1) {
				System.out.println(nums[i]);
			}

		}

	}

	public static int isEqual(int[] nums, int num) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) {
				count++;
			}
		}
		return count;
	}

}
