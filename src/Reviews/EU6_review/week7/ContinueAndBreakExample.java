package Reviews.EU6_review.week7;

public class ContinueAndBreakExample {
	
	public static void main(String[] args) {
		
		for(int i=0; i < 10; i++) {
			
			if(i == 3 ) {
				continue;
			}
			
			if(i == 7) {
				break;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("-----------------------");
		
		outer: for(int i=0; i < 4; i++) {
			
			if(i == 2) {
				continue;
			}
			
			inner: for(int j=0; j < 4; j++) {
				
				if(j == 2) {
					continue outer;
				}
				
				if(i == 1) {
					break ;
				}
				
				System.out.println(i + " " + j);
			}
			

		}
		
	}

}
