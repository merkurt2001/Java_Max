package Reviews.EU6_review.week15;

public final class Rectangle extends Shape {
	
	private double w, l;
	
	public Rectangle(double w, double l) {
		super("Rectangle");
		setL(l);
		setW(w);
		
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		if( w <=0) {
			return;
		}
		this.w = w;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		if(l <= 0) {
			return;
		}
		this.l = l;
	}

	
	@Override
	public double area() {
		return w * l;
	}

	
	@Override
	public double perimeter() {
		return (w+l)*2;
	}
	

}

/*

Rectangle
	Attributes:
		w, l

	ACTION:
		area(): w * l
		perimeter(), toString()
*/