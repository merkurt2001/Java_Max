package groupStudies.GroupStudies.Methods;

public class MethodsDevStr2 {
	/*
	 * Second version (structured, with redundancy): 
	 * ■ Identify the structure of the output. 
	 * ■ Divide the main method into static methods based on this structure.
	 */
	/*The structure of the output:
		■ initial "egg" figure
		■ second "teacup" figure
		■ third "stop sign" figure
		■ fourth "hat" figure*/
	
	public static void main(String[] args) {
		egg();
		teaCup();
		stopSign();
		hat();
	}

	public static void egg() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
		System.out.println("\\        /");
		System.out.println(" \\______/");
		System.out.println();
	}

	public static void teaCup() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
		System.out.println();
	}

	public static void stopSign() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
		System.out.println("|  STOP  |");
		System.out.println("\\        /");
		System.out.println(" \\______/");
		System.out.println();
	}

	public static void hat() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
		System.out.println("+--------+");
	}
}
