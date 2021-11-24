package Reviews.EU6_review.week10;

public class ArraysPractice1 {
	
	
	public static void main(String[] args) {
		
		
		
		String[] students = new String[5]; //index: 0,1,2,3,4
		
		students[0] = "Selda";
		students[1] = "Volkan";
		students[2] = "Hasan";
		students[3] = "Fatma";
		students[4] = "Cemil";
		//students[-1]=  "Niyazi";		
		
	//	String[] students = {"Selda", "Volkan", "Hasan", "Fatma", "Cemil"};
		
		for(int i = 0; i <= students.length -1; i++) { //i represents the indexes of the array
			
			System.out.println(students[i]);
			
		}
		
		
		System.out.println("---------------------------------");
		
		int[] numbers = {10, 20, 5, 40, 3};
		int max =  numbers[0]; // 40
		int min = numbers[0];
		
		
		for( int i =1; i <= numbers.length-1; i++) {
			max = Math.max(numbers[i], max);
			min = Math.min(numbers[i], min);
			
		}
		
		
		/*
		for( int i =1; i <= numbers.length-1; i++) {
			if(numbers[i]  > max) { // 
				max = numbers[i];
			}
			
			if(numbers[i] < min) {
				min = numbers[i];
			}
			
		}
		*/
		
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		
		
		
		
	}
	

}
