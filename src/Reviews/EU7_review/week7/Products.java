package Reviews.EU7_review.week7;

public class Products {

	String name;
	double price;
	
	public void setInfo(String n, double d) {
		name = n;
		price = d;
	}

	
	public String toString() {
		return "Products [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
