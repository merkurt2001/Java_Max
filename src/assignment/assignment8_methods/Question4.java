package assignment.assignment8_methods;

public class Question4 {

	public static void main(String[] args) {
		hollowRect();
	}

	public static void hollowRect() {
		for (int i = 1; i <=5; i++) {
			System.out.println("*");

			for (int k = 1; k <5; k++) {

				if (i > 1 && i < 5) {
					if (k > 1 && k <5) {

						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				} else {
					System.out.print("*");
				}
			}
		}
	}
}
