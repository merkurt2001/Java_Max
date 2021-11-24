package Reviews.EU6_review.week18;

public class TryCatch_VS_Throws {
	
	
	public static void main(String[] args) {
		
		method1();
	//	method2();
		
		
	}
	
	
	public static void method1() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void method2() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(3000);
	}
	
	
	
	
	

}
