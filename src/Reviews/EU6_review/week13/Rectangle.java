package Reviews.EU6_review.week13;

public class Rectangle {
	
	
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if(length < 0) { // if the given length is negative
			return; // exit the method
		}
		
		this.length = length; // if the given length is not negative
	}

	
	public double getWidth() {
		return width;
	}
	

	public void setWidth(double width) {
		if(width < 0) { // if the given length is negative
			return; // exit the method
		}
		
		this.width = width;
	}

	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	// area(), perimeter()
	
	
	
	
	
	
	
	
	
	
	
	
	

}
