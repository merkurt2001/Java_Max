package weeklyMeeting.GroupStudies;

import java.util.Scanner;

public class ifElseExample {
	
	static Scanner sc;

	public static void main(String[] args) {
		String order = "burger";

		String  price = "";

		if (order.equals("chicken")){
			price = "9.75";
		}else if (order.equals("burger")){
			price = "12.50";
		}

		System.out.println("Your total is $" + price);
	}

}
