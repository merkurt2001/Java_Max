package groupStudies.GroupStudies.Methods;

public class MethodBox {

	public static void main(String[] args) {

		System.out.println(drawBox(3) + " boxes produced");

	}

	public static int drawBox(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("+-----+");
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("+-----+");
			System.out.println();
		}
		return num;

	}

	public static void drawBox() {
		System.out.println("+-----+");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("+-----+");

	}
}
