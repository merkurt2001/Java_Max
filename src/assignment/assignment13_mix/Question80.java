package assignment.assignment13_mix;

public class Question80 {

	public static void main(String[] args) {
		
		int countCentury=0;
		int countHalfCentury=0;
		int countDoubleCentury=0;

		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};

		for(int i=0; i<scores.length;i++) {
			if(scores[i]>=50 && scores[i]<100 ) {
				countHalfCentury++;
			}else if(scores[i]>=100 && scores[i]<200) {
				countCentury++;
			}else if(scores[i]>=200) {
				countDoubleCentury++;
			}

		}

		System.out.println("the number of half-centuries: "+countHalfCentury);
		System.out.println("the number of centuries: "+countCentury);
		System.out.println("the number of double-centuries: "+countDoubleCentury);

	}

}
