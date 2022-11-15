package weeklyMeeting.GroupStudies.Arrays;

public class flagUsage {

	public static void main(String[] args) {
		// write a method that returns you the letters between two different items given
		// among your array elements

		char[] letter = { 'a', 'b', 'h', 'e', 'l', 'l', 'o', ' ', 's', 'b', 'w', 'o', 'r', 'l', 'd', 's', 'b', '!' };
//								ON---------------------------------OFF ON---------------------------OFF

		System.out.println(getBetween(letter, 'b', 's'));
	}

	public static String getBetween(char[] letter, char ch1, char ch2) {
		String result="";
		boolean flag=true;
		
		for (int i = 0; i < letter.length; i++) {
			
			if (letter[i]==ch1) {
				flag=false;
			}else if (letter[i]==ch2) {
				flag=true;
			}else if (!flag) {
				result=result+letter[i];
			}
			
		}
		
		
		return result;
		
		
	}

}