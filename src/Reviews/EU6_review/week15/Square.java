package Reviews.EU6_review.week15;

public final class Square extends Shape{
	
	private double s;
	

	public Square(double s) {
		super("Square");
		setS(s);
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		if(s <= 0) {
			return;
		}
		this.s = s;
	}

	
	@Override
	public double area() {
		return s * s;
	}

	
	@Override
	public double perimeter() {
		return s * 4;
	}
	

}

/*
Square
	Attributes:
		s
	
	ACTION:
		area(): s * s
		perimeter(), toString()

*/