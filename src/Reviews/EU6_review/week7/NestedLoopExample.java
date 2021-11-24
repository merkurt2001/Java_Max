package Reviews.EU6_review.week7;

public class NestedLoopExample {
	public static void main(String[] args) {
		
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */
		

		for(int i= 1; i <= 3; i++) {
			for(int j= 1; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		
		}
		
		System.out.println();
		
		// ------------------------
		
		// 1 * 1 = 1
		// 1 * 2 = 2
		// 10 * 10 = 100
		
		for(int i= 1; i <= 10; i++) {
			
			for(int j= 1; j <= 10; j++) {
				
				System.out.println(i + "*" + j + "=" + (i * j));
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
