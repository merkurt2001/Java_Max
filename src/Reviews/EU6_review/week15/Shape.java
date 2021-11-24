package Reviews.EU6_review.week15;

public class Shape {
	
	private final String name;
	

	public Shape(String name) { // initializes the name
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double area() {
		return 0;
	}
	
	public  double perimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", area=" + area() + ", perimeter=" + perimeter() + "]";
	}
	

}

/*
 Shape
		Attribute:
			name

		Actions/methods:
			area(), perimeter()
			 toString()
*/
