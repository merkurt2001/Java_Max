package Reviews.EU6_review.week8;

public class Art {
	
	public static void draw() {
		System.out.println("Basic drawing");
	}
	
	
	public static void draw(String color) {
		System.out.println("Drawing with " + color);
	}
	
	public static void draw(int size) { // int size = 5
		System.out.println("drawing this size: " + size);
	}
	
	public static long draw(String color, int size) {
		System.out.println("color and size");
		return 0;
	}
	
	public static void draw(int size, String color) {
		System.out.println("order flipped");
	}
	
	public static double draw(double height) {
		System.out.println("height method");
		return 0.0;
	}
	
	public static void main(String[] args) {
		draw(5, "red");
		draw(5);
		draw(3.2f);
		draw((byte)2);
		
		short b = 0;
		draw(b);
		
	}

}
