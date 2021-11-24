import java.util.Scanner;

public class GetSandwich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if (str.contains("bread")) {
			int firstIndex=str.indexOf("bread");
			int lastIndex=str.lastIndexOf("bread");
			
			if (firstIndex==lastIndex) {
				System.out.println("nothing");
			}else {
				System.out.println(str.substring(firstIndex+5,lastIndex));
			}
			
			
		}else {
			System.out.println("nothing");
		}

	}
}
