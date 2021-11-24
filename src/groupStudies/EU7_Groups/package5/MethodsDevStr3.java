package groupStudies.EU7_Groups.package5;

public class MethodsDevStr3 {
	/*
	 * Third version (structured, without redundancy): ■ Identify redundancy in the
	 * output, and create methods to eliminate as much as possible. ■ Add comments
	 * to the program.
	 */
	/*
	 * The redundancy in the output: 
	 * ■ egg top: reused on stop sign, hat 
	 * ■ egg bottom: reused on teacup, stop sign 
	 * ■ divider line:used on teacup, hat 
	 * 
	 * This redundancy can be fixed by methods: 
	 * ■ eggTop ■ eggBottom ■ line
	 */

	public static void main(String[] args) {
		egg();
		teaCup();
		stopSign();
		hat();
	}

	// Draws the top half of an an egg figure.
	public static void eggTop() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}

	// Draws the bottom half of an egg figure.
	public static void eggBottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}

	// Draws a complete egg figure.
	public static void egg() {
		eggTop();
		eggBottom();
		System.out.println();
	}

	// Draws a teacup figure.
	public static void teaCup() {
		eggBottom();
		line();
		System.out.println();
	}

	// Draws a stop sign figure.
	public static void stopSign() {
		eggTop();
		System.out.println("|  STOP  |");
		eggBottom();
		System.out.println();
	}

	// Draws a figure that looks sort of like a hat.
	public static void hat() {
		eggTop();
		line();
	}

	// Draws a line of dashes.
	public static void line() {
		System.out.println("+--------+");
	}

}
