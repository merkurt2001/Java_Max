package Reviews.EU6_review.week18;

public class ExceptionHandlings {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Test1 Started");
		
		int[] arr = {1,2,3};
		
		
		try {
			System.out.println(arr[2000]); // unchecked exception
		}catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println("inside catch");
		}
		
		
		
		
		System.out.println("Test1 completed");
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Test2 started");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test2 completed");
		
		System.out.println("-------------------------------------------");
		System.out.println("Test3 started");
		
		
			Thread.sleep(3000);
		
		
		System.out.println("Test3 completed");
		
		
	}
	

}
