package assignment.assignment11_mix;

public class Question35 {

	public static void main(String[] args) {
		
		String str = "Java is fun";
		
		String arr[] = str.split(" ");
		
		String reversed= "";
		
		for(int i=arr.length-1;i>=0;i--) {
			reversed = reversed + arr[i] + " ";
		}
		
		System.out.println(reversed);

	}

}
