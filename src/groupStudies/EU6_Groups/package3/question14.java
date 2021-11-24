package groupStudies.EU6_Groups.package3;

public class question14 {

	public static void main(String[] args) {
		for (int r = 1; r <= 7; r++) {
			System.out.print("#");
			for (int c = 1; c <= r; c++) {

				if (c == r) {
					System.out.print("#");
					continue;
				}
				if (c % 1 == 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
