package Reviews.EU6_review.week16;

public class Cylinder extends Shape implements Volume{

	private double radius, height;
	public static final double PI = 3.14;
	
	
	public Cylinder(double radius, double height) {
		super("Cylinder");
		setRadius(radius);
		setHeight(height);
	}	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double volume() {
		return 0;
	}

	@Override
	public double area() {
		
		return 0 ;
	}

	@Override
	public double perimeter() {
		
		return 0;
	}
	
	
	
	

}
