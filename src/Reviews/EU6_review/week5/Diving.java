package Reviews.EU6_review.week5;

public class Diving {
	
	/*
	 * [Diving]

		You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
		
		> Above 90 - Your tank is full
		> Above 80 - Still okay
		> Above 70 - Don't go too far
		> Above 60 - Start to head back
		> Above 50 - Be careful now you are at 50%
		
	 */
	
	public static void main(String[] args) {
		
		int oxygenLevel = -34;
		String message = "";
		
		
		if(oxygenLevel <= 100 && oxygenLevel >= 0) {
			// If you are here the o2 is less or equal to 100 and o2 is more than or equal to 0
			
			if(oxygenLevel >= 90) {
				message = "Your tank is full";
			} else if(oxygenLevel >= 80) {
				message = "Still okay";
			} else if(oxygenLevel >= 70) {
				message = "Don't go too far";
			} else if(oxygenLevel >= 60) {
				message = "Start to head back";
			} else if(oxygenLevel >= 50){
				message = "Be careful now you are at 50%";
			} else {
				message = "Less than 50%";
			}
			
			System.out.println(message);
			
		} else {
			System.out.println("Invalid level given");
		}
		
		
		
	}

}
