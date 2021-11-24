package Reviews.EU6_review.week8;

public class MarkerObjs {
	
	public static void main(String[] args) {
		
		// Make an object of Marker
		
		Marker markerOne = new Marker();
		markerOne.name = "Expo";
		markerOne.color = "Blue";
		markerOne.height = 3.5;
		
		Marker markerTwo = new Marker();
		markerTwo.setInfo("Expo 2", "Red", 3.2);
		
//		System.out.println(markerOne.name);
//		System.out.println(markerTwo.name);
		
		markerOne.print();
		System.out.println();
		markerTwo.print();
		System.out.println();
		
		System.out.println(markerOne.writeMsg("first message"));
		System.out.println(markerTwo.writeMsg("second message"));
		
	}

}
