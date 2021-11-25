package assignment.assignment4_selectionStatements;

public class Question12 {

	public static void main(String[] args) {
		
		String internetPackage = "K";
		int usage = 25;
		
		switch (internetPackage) {
			case "A": case "a":
				if(usage>10) {
					System.out.println("Your bill is " + (9.95  + (usage-10)*2));
					break;
				}else {
					System.out.println("Your bill is " + 9.95);
					break;
				}
			case "B": case "b":
				if(usage>20) {
					System.out.println("Your bill is " + (13.95  + (usage-20)*1));
					break;
				}else {
					System.out.println("Your bill is " + 13.95);
					break;
				}
			case "C": case "c":
				System.out.println("Your bill is " + 19.95);
				break;
			default:
				System.out.println("Invalid Package Name");
		}

	}

}
