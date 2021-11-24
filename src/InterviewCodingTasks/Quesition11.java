package InterviewCodingTasks;

public class Quesition11 {

	public static void main(String[] args) {
		System.out.println(c_profits(100,1500));
		System.out.println(c_profits(20,5));
		System.out.println(c_profits(100,100));

	}

	public static String c_profits(int buyPrice, int sellPrice) {
		if (buyPrice>sellPrice) {
			return "loss";
		}else if (buyPrice<sellPrice) {
			return "profit";
		}else {
			return "no loss";
		}
		
	}

}
