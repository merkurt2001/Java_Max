package Reviews.EU6_review.week16;

public class Rectangle extends Shape{

	private double width, length;
	
	public Rectangle( double width, double length) {
		super("Rectangle");
		setLength(length);
		setWidth(width);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double area() {
		return width * length;
	}

	@Override
	public double perimeter() {
		return 2 * (width+length);
	}
	
	
	
	
	
	
	
}
