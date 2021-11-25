package assignment.assignment7_nested_forLoop;

public class Question5 {

	public static void main(String[] args) {
		
		int row=7;
		int column=7;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=column;j++) {
				
				if(j>row-i) {
					System.out.print(i);
				}else {
					System.out.print("1");
				}
				
			}System.out.println();
		}

	}

}

//  5> 7-2
//  6> 7-2
//  7> 7-2

// 4> 7-3
// 5> 7-3
// 6> 7-3
// 7> 7-3