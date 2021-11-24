package Reviews.EU6_review.week7;

public class MethodsPractice {
	
	public static void main(String[] args) {
		System.out.println(getAgeInDays(10) + " Days old");
		System.out.println(getAgeInDaysMsg(10));
		
		System.out.println(getAllLetters(true, true)); // uppercase, a -> z
		System.out.println(getAllLetters(true, false)); // uppercase, z -> a
		System.out.println(getAllLetters(false, true)); // lowercase, a -> z
		System.out.println(getAllLetters(false, false)); // lowercase, z -> a
	}
	
	
	public static int getAgeInDays(int years) {
		return years * 365;
	}
	
	public static String getAgeInDaysMsg(int years) {
		return getAgeInDays(years) + " Days old";
	}
	
	public static String getAllLetters(boolean isUpperCase, boolean goAtoZ) {
		
		int start = 0;
		int finish = 0;
		
		if(isUpperCase) {
			start = 'A'; // 65
			finish = 'Z'; // 90
		} else {
			start = 'a'; // 97
			finish = 'z'; // 122
		}
		
		String result = "";
		
		if(goAtoZ) {
			
			for( ; start <= finish; start++) {  
				result += (char)start;
			}
			
		} else {
			
			for( ; finish >= start; finish--) {
				result += (char)finish;
			}
			
		}
		
		return result;
	}

}
