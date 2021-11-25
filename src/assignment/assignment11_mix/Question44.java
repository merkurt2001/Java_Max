package assignment.assignment11_mix;

public class Question44 {

	public static void main(String[] args) {
		
		double[] temps = {80,88,88,84,82,78,60,68};
		
		double total = 0;
		double avgTemp = 0;
		
		for (int i = 0; i<temps.length;i++) {
			total = total + temps[i];
		}
		
		System.out.println((avgTemp = total / temps.length));

	}

}
