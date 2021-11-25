package assignment.assignment8;

public class Question16 {

	public static void main(String[] args) {
		System.out.println(simpleRoomBook(false, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 7, 2, 2018));
	}

//	the room is already booked between 7/1/2018 - 7/8/2018 and not available
	private static boolean simpleRoomBook(boolean isAvailable, int mounth, int day, int year) {
		if (!isAvailable) {
			return false;
		}
		if (year != 2018) {
			return false;
		}
		if (mounth == 7 && day >= 1 && day <= 8) {
			return false;
		}
		return true;

	}

}
