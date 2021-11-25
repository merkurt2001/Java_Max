package assignment.assignment8;

public class Question17 {

	public static void main(String[] args) {
		System.out.println(getThunderBlazz(true, false, 1, 2, 3));
		System.out.println(getThunderBlazz(false, false, 1, 2, 3));
		System.out.println(getThunderBlazz(false, false, 1, 5, 3));
		System.out.println(getThunderBlazz(false, false, 3, 1, 2));
		System.out.println(getThunderBlazz(false, false, 3, 1, 1));
		System.out.println(getThunderBlazz(false, true, 9, 7, 3));

	}

	public static boolean getThunderBlazz(boolean avialable, boolean gift, int ingredient1, int ingredient2,
			int ingredient3) {
		if (avialable) {
			return true;
		}
		if (gift) {
			return true;
		}
		if ((ingredient2 == 2 * ingredient1 && ingredient3 == 3 * ingredient1)
				|| (ingredient1 == 3 * ingredient2 && ingredient3 == 2 * ingredient2)) {
			return true;
		}
		return false;

	}

}
