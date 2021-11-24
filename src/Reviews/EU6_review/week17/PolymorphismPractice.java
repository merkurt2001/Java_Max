package Reviews.EU6_review.week17;

import Reviews.EU6_review.week14.Developer;
import Reviews.EU6_review.week14.Driver;
import Reviews.EU6_review.week14.Employee;
import Reviews.EU6_review.week14.Teacher;
import Reviews.EU6_review.week14.Tester;

import Reviews.EU6_review.week16.Circle;
import Reviews.EU6_review.week16.Cube;
import Reviews.EU6_review.week16.Cylinder;
import Reviews.EU6_review.week16.Rectangle;
import Reviews.EU6_review.week16.Shape;
import Reviews.EU6_review.week16.Square;

public class PolymorphismPractice {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(3);
		Rectangle rectangle = new Rectangle(4, 5);
		Square square = new Square(6);
		Cylinder cylinder = new Cylinder(8, 7);
		
		
		Shape[] array = {circle, square, rectangle, cylinder, new Circle(10), new Square(20)};
		
		
		/*
		WebDriver driver = new chromer
						   new firefox
						   ....
		 */
		
		
		Employee employee1 = new Driver("John", 'M', 32, "Truck Driver", 950000);
		Employee employee2 = new Teacher("Asiya", 'F', 24, "Softskill teacher", 110000);
		Employee employee3 = new Developer("Annie", 'F', 28, "Java Developer", 110000);
		
		
		
		// verify that employee1 is Developer
		boolean r1 = employee1 instanceof Developer;
		
		boolean r2 = employee1 instanceof Employee;
		
		boolean r3 = !(employee2 instanceof Driver);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		
		
		
		
		
		
	}

}
