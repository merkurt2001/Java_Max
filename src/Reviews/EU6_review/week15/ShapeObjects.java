package Reviews.EU6_review.week15;

public class ShapeObjects {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(5);
		
		circle.setR(10);
		
		System.out.println(circle);
		System.out.println( circle.getR() );
		
		System.out.println("--------------------------------------------");
		
		
		Rectangle rectangle = new Rectangle(10, 8);
		
		System.out.println(rectangle);
		System.out.println(rectangle.getL());
		System.out.println(rectangle.getW());
		
		System.out.println("--------------------------------------------");
		
		Square square = new Square(4);
		
		System.out.println(square);
		System.out.println(square.getS());
		
		
	}

}
