package Reviews.EU6_review.week8;

public class Marker {
	
	// Instance variables
	
	String name;
	String color;
	double height;
	
	// Instance method
	

	public String writeMsg(String msg) {
		return name + " is writing " + msg;
	}
	
	public void setInfo(String setName, String setColor, double setHeight) {
		name = setName;
		color = setColor;
		height = setHeight;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Height: " + height);
	}

}
