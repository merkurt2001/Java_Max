package assignment.assignment4_selectionStatements;

public class Question7 {

	public static void main(String[] args) {
		
		int seconds=18000;
		if(seconds>=86400) {
			int day = seconds/86400;
			System.out.println(seconds + " seconds has " + day +" day in it" );
		}else if(seconds>=3600) {
			int hour = seconds/3600;
			System.out.println(seconds + " seconds has " + hour +" hour in it" );
		}else if(seconds>=60) {
			int minute=seconds/60;
			System.out.println(seconds + " seconds has " + minute +" minute in it" );
			
		}
		
		
		//Second converter
		int userSeconds=500000;
		int numberOfDays;
		int numberOfHours;
		int numberOfMinutes;
		int numberOfSeconds;

		numberOfDays = userSeconds / 86400;
		numberOfHours = (userSeconds % 86400 ) / 3600 ;
		numberOfMinutes = ((userSeconds % 86400 ) % 3600 ) / 60;
		numberOfSeconds = ((userSeconds % 86400 ) % 3600 ) % 60  ;
		
		System.out.println(userSeconds + " seconds: " + numberOfDays + " day " + numberOfHours + " hours " + numberOfMinutes + " minutes " + numberOfSeconds + " seconds");
		

	}

}
