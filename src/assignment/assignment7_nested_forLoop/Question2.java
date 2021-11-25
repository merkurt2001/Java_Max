package assignment.assignment7_nested_forLoop;

public class Question2 {

	public static void main(String[] args) {
		
		for(int i=7;i>1;i--) {
			System.out.print(1);
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1;i<=7;i++) {
			System.out.print(1);
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		


	}

}
