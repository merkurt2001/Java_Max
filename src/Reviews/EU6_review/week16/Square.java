package Reviews.EU6_review.week16;

public class Square extends Shape{
	
	private double side;

	public Square( double side) {
		super("Square");
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}
	
	
	
	

}
