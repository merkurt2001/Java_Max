package Reviews.EU6_review.week16;

public class Cube extends Shape implements Volume{
	
	private double side;
	

	public Cube( double side) {
		super("Cube");
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double volume() {
		
		return 0;
	}

	@Override
	public double area() {
		
		return 0;
	}

	@Override
	public double perimeter() {
		
		return 0;
	}
	
	
	
	
	
	
	

}
