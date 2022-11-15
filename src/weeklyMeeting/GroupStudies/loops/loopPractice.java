package weeklyMeeting.GroupStudies.loops;

public class loopPractice {

	public static void main(String[] args) {

		// Number-1
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}

		// Number-2
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}

		// Number-3
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}

		// Number-4
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

		// Number-5
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}

		// Number-6
		// ****1
		// ***2
		// **3
		// *4
		// 5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*" + " ");
			}
			System.out.print(i);
			System.out.println();

		}

		// Number-8
		// ****1
		// ***22
		// **333
		// *4444
		// 55555
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();

		}

		// Number-9
		// ****1
		// ***2*
		// **3**
		// *4***
		// 5****
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			System.out.print(i);
			
			for (int j = 1; j < i  ; j++) {
				System.out.print("*");
			}
			System.out.println();

		}


	}
}
