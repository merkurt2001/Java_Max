package groupStudies.GroupStudies.Methods;

public class MethodSquare2 {

	public static void main(String[] args) {
		
		System.out.println(draw(3)+ " times produced");
		

	}

	public static int draw(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println("+-----+");
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("+-----+");
			System.out.println();
			
		}
		return i;
	}

	public static void draw() {
		System.out.println("+-----+");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("+-----+");
		
	}

}
