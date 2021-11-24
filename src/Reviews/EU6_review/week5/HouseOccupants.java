package Reviews.EU6_review.week5;

/*
 * [House Occupants]

Given a house type (String) print out the number of max occupants (int)

            Tree house: 1
            Mobile home: 2
            Apartment: 4
            Town house: 6
            Villa: 8
            Mansion: 10

-> Try to use variables instead of printing multiple times

_
 */

public class HouseOccupants {
	
	
	public static void main(String[] args) {
		
		String houseType = "something";
		int maxNumberOfOccupants = 0;
		
		switch(houseType) {
		
			case "Tree house":
				maxNumberOfOccupants = 1;
				break;
			case "Mobile home":
				maxNumberOfOccupants = 2;
				break;
			case "Apartment":
				maxNumberOfOccupants = 4;
				break;
			case "Town house":
				maxNumberOfOccupants = 6;
				break;
			case "Villa":
				maxNumberOfOccupants = 8;
				break;
			case "Mansion":
				maxNumberOfOccupants = 10;
				break;
			default:
				System.out.println( houseType +  " is an invalid house type");
		}
		
		if(maxNumberOfOccupants > 0) {
			System.out.println("With house type: " + houseType + " your max number of occupants is " + maxNumberOfOccupants);
		}
	}
	
	
	
	

}
