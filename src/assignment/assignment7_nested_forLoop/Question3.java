package assignment.assignment7_nested_forLoop;

public class Question3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=7;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--) {
			
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=7;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
