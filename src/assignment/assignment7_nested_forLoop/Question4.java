package assignment.assignment7_nested_forLoop;

public class Question4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			
			System.out.print(1);
			
			for(int j=1;j<i;j++) {
				
				if(j%2!=0) {
					
					System.out.print(0);
				}else {
					System.out.print(1);
				}
			}
			System.out.println();
		}

	}

}
