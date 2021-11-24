package Reviews.EU6_review.week15;

public final class Circle extends Shape{  // Circle Is A Shape
	
	public Circle( double r) { // sets the name and radius of the circle
		super("Circle");
		setR(r);
	}

	private double r;
	public static final double PI;
	
	static {
		PI = 3.14;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		
		if(r <= 0) {
			return;
		}
		
		this.r = r;
	}

	
	@Override
	public double area() {
		return r * r * PI;
	}

	
	@Override
	public double perimeter() {
		return 2 * r * PI;
	}
	
	

}

/*
Circle
	Attributes:
		r, pi
	
	ACTION:
		area(): r * r * PI
		perimeter(), toString()
*/