package Reviews.EU6_review.week16;

public  abstract class Shape {

	private final String name;
	

	public Shape(String name) { // initializes the name
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	public  abstract double area();
	
	public abstract double perimeter();
	
	//public abstract double volume();
	
	
	
	
	public String toString() {
		return "Shape [name=" + name + ", area=" + area() + ", perimeter=" + perimeter() + "]";
	}
	


}
