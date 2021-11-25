package assignment.assignment12_mix;

import java.util.ArrayList;
import java.util.Arrays;

public class Question69 {

	public static void main(String[] args) 
	
	{
		ArrayList<Boolean> booleans = new ArrayList<>(Arrays.asList(true, false, false));

		repeatAL(booleans);
	}
	

	public static void repeatAL(ArrayList<Boolean> booleans) {

		int newSize = booleans.size();

		for (int i = 0; i < newSize; i++) {

			booleans.add(booleans.get(i));
		}

		System.out.println(booleans.toString());

	}
		
		

	

}
