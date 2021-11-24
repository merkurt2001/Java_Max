public class BadProduct {

	public static void main(String[] args) {
		int[] product = { 1, 1, 1, 1, 0, 0, 0, 0 };
		int limit = 3;
		System.out.println(badP(product, limit));

	}

	public static boolean badP(int[] products, int limit) {
		int count = 0;
		for (int val : products) {
			if (val == 0) {
				count++;
			}
		}
		if (count >= 3) {
			return false;
		} else {
			return true;
		}

	}
}
