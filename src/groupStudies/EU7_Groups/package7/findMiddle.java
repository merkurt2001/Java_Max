package groupStudies.EU7_Groups.package7;

public class findMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 4, 9, 1, 3, 6, 4 };
		System.out.println(findTheMiddle(myArray));
	}

	public static int findTheMiddle(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int totalleft = 0;
			int totalright = 0;
			for (int j = 0; j < i; j++) {
				totalleft += arr[j];
			}
			for (int t = arr.length - 1; t > i; t--) {
				totalright += arr[t];
			}
			if (totalleft == totalright) {
				return i;
			}

		}
		return -1;

	}
}
