import java.util.Scanner;

public class ZombiAttacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();
		
		for (int i = 0; inhabitants>0 ; i++) {
			
			System.out.println("Day "+i+" ["+inhabitants+"]");
			inhabitants=inhabitants/2;
		}
		System.out.println("---- EXTINCT ----");
	}
}