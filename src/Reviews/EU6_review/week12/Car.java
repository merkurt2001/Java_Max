package Reviews.EU6_review.week12;

public class Car {
	
	
	
	public String brand, model, color;
	public double price;
	public int year;
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public Car(String brand, String model, String color) {
		this(brand, model);
		this.color = color;
	}

	public Car(String brand, String model, String color, double price) {
		this(brand, model, color);
		this.price = price;
	}

	public Car(String brand, String model, String color, double price, int year) {
		this(brand, model, color, price);
		this.year = year;
	}


		
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", year=" + year
				+ "]";
	}
	
	public void start() {
		System.out.println(brand+" "+model +" is started");
	}
	
	public void drive() {
		System.out.println(brand+" "+model +" is on the road");
	}
	
	
	
	
	
	

}
