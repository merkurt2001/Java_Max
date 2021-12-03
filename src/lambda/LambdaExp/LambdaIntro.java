package lambda.LambdaExp;

public class LambdaIntro {

	public static void main(String[] args) {

//		Moveable moveXMile3 = new DistantMover();
//		//moveXMile3.move(100);
//		
//		Moveable moveXMile4 = new ShortDistanceMover();
//		//moveXMile4.move(100);
//
//		moveAction(moveXMile4);
//		moveAction(moveXMile3);

		// instead of creating different class for different implementation
		// Anonymous inner class version
		Moveable moveXMile = new Moveable() {
			@Override
			public void move(int distance) {
				System.out.println("moving " + distance);
			}
		};

		// Lambda version-1
		Moveable moveXMile1 = (int distance) -> {
			System.out.println("moving " + distance);
		};

		// Lambda version-2
		Moveable moveXMile2 = distance -> System.out.println("moving " + distance);

		moveXMile.move(10);
		moveXMile1.move(20);
		moveXMile1.move(30);

		moveAction(moveXMile);
		// Lambda usage--pass as parameter
		moveAction(distance -> System.out.println("moving " + distance));

		System.out.println("=====================");

		Measurable m1 = () -> System.out.println("measuring Square");
		Measurable m2 = () -> System.out.println("measuring rectangle");
		Measurable m3 = () -> {
			System.out.println("measuring circle step1");
			System.out.println("measuring circle step2");

		};

		m1.measure();
		m2.measure();
		m3.measure();

		System.out.println("=====================");
//lambda with parameters
		Computable adder = (num1, num2) -> System.out.println("adding result " + (num1 + num2));
		Computable multiplier = (num1, num2) -> System.out.println("adding result " + (num1 * num2));

		adder.compute(5, 10);
		multiplier.compute(4, 5);

		System.out.println("=====================");
//lambda return a value
		Flyable drone = (int mile) -> {
			return mile > 10;
		};

		System.out.println(drone.flyHigh(2));

		Flyable drone1 = mile -> mile > 20;
		System.out.println(drone.flyHigh(21));

	}

	public static void moveAction(Moveable moveable) {

		moveable.move(250);

	}

}
