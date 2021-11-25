package assignment.assignment6_forLoop;

public class Question7 {
	


	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--) {
			
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k>0;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		

	}

}
