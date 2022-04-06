package groupStudies.GroupStudies.package4;

public class Practice {

	

	/*
	 * 				think 3 instead of SPACES 			the NUMBERS 
	 * 					(FIRST SHAPE) 					(SECOND SHAPE)	
	 *  4 3 2 1 			#								4 3 2 1 
	 *   3 2 1 		== 		## 					+ 			3 2 1 
	 *    2 1 				### 							2 1	
	 *     1 				####						    1
	 */

	
	public static void main(String[] args) {
		// We have in total

		// 4 ROWS => we create the ROWS thanks to our OUTER LOOP
		// 4 CLOUMNS => we create the COLUMNS thanks to our INNER LOOP

		// 1) // to have the first shape of SPACES
		// we will try firstly using # signs to verify our spaces shape

		// first way that comes to my mind when I wanna have 4 row

		for (int i = 1; i <= 4; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// second way - more appropriate for my rest shapes
		System.out.println("------------------------------------------------");

		for (int i = 4; i >= 1; i--) {

			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2) // I will just remove the = sign form the inner loop's condition
		// in order to not have any # sign in the first line and directly skip it

		System.out.println("------------------------------------------------");

		for (int i = 4; i >= 1; i--) {

			for (int k = 4; k > i; k--) {
				System.out.print("*"); // => MY FIRST SHAPE IS DONE
			}
			System.out.println();
		}

		// 3) // Lets create our SECOND SHAPE now
		// for adjustment of my both shapes, I will use the same outer loop that I used
		// for my first shape
		System.out.println("------------------------------------------------");

		for (int i = 4; i >= 1; i--) {

			for (int j = i; j >= 1; j--) { // will start with my row number (i) and decrase 
											//by one in each iteration
											// till 1
				System.out.print(j + " ");
			}
			System.out.println(); // => MY SECOND SHAPE is done
		}

		// 3) // Lets combine out two shapes to get our expected result that question
		// asks from us
		System.out.println("------------------------------------------------");

		for (int i = 4; i >= 1; i--) {

			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
