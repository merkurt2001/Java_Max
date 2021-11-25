package assignment.assignment11_mix;

public class Question41 {

	public static void main(String[] args) {
		
		int[] year = new int[10];

		int growth = 1;
		int treeSize = 1;

		for (int i = 0; i < 10; i++) {
			year[i] = i + 1;

			if (i < 3) {

				treeSize = year[i] * growth;

				System.out.println("year " + year[i] + " - growth 1 cm");
				System.out.println("tree size: " + treeSize+" cm");
			}

			if (i >= 3) {
				growth = 2;
				treeSize += 2;

				System.out.println("year " + year[i] + " - growth 2 cm");
				System.out.println("tree size: " + treeSize+" cm");
			}

		}
	}

}
