package Reviews.EU6_review.week16;

public class Circle extends Shape {
	
	
	private double radius;
	
	
	public Circle( double radius) {
		super("Circle");
		setRadius(radius);
	}

	public static final double PI = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * PI;
	}

	@Override
	public double perimeter() {
		return 2 * radius * PI;
	}
	
	
	
	
	

}
