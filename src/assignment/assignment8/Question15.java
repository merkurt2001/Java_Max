package assignment.assignment8;

public class Question15 {

	public static void main(String[] args) {
		System.out.println(validateTask(true, 2, 1));
		System.out.println(validateTask(true, 3, 1));
		System.out.println(validateTask(false, 3, 2));

	}

	public static boolean validateTask(boolean b, int taskId, int currentId) {
		if (b != true || taskId != ++currentId) {
			return false;
		} else {
			return true;
		}
	}

}
