package Reviews.EU6_review.week8;

public class LocalVSInstance {
	
	// instance variable
	
	int a;
	
	public void talk() {
		int a = 5;
		int z = 0;
		
		System.out.println(a);
		System.out.println(z);
		
	}
	
	public static void main(String[] args) {
		LocalVSInstance obj = new LocalVSInstance();
		obj.talk();
		System.out.println(obj.a);
		
		
//		new LocalVSInstance().talk();
//		System.out.println(new LocalVSInstance().a);
		
		for(int i=0; i < 5; i++) {
			
			System.out.println(i);
		}
		
		for(int i=0; i < 5; i++) {
			
			
		}
		
//			These are not in scope
//		System.out.println(i);
//		System.out.println(z);
		
	}
	

}
