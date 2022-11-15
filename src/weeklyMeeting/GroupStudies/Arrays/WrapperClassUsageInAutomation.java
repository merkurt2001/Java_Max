package weeklyMeeting.GroupStudies.Arrays;

public class WrapperClassUsageInAutomation {

	public static void main(String[] args) {

		// how to use wrapper class in out automation framework
		//search result for an given item in amazon and show the result add 1 to result

		String str = "1-48 of over 3,000 results for";

		 // First-- using split method divide and create and String array
		 String[] split = str.split(" ");

		//second-- split 4,000 again to get rid of comma
		String [] result= split[3].split(",");

		// third merge 4 and 000 to get the result
		String resultOfItem=result[0]+result[1];

		//print out String
		System.out.println(resultOfItem+1);

		int totalNum = Integer.parseInt(resultOfItem);

		System.out.println(totalNum+1);
	}
}
