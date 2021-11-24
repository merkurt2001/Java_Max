package groupStudies.EU6_Groups.package3;

public class NestedLoops {

	public static void main(String[] args) {

		int lineCount = 5;
		for (int i = 1; i <= lineCount; i++) {
			int value = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(value + " ");
				value += lineCount - j;
			}
			System.out.println("");

		}
	}

}

//1            (1 number prints) 
//2 6            (2 numbers print) --- (+4)
//3 7 10        (3 numbers print) ---- (+4)--- (+3)
//4 8 11 13        (4 numbers print) --(+4) ---(+3) ---(+2)
//5 9 12 14 15    (5 numbers print)--- (+4)-----(+3) --- (+2) --- (+1)