package assignment.assignment12_mix;

import java.util.ArrayList;

public class Question61 {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("xyz");
		arrList.add("abc");
		arrList.add("klm");
		
		words(arrList);
		
		System.out.println(arrList);

	}
	
	public static void words(ArrayList<String> al) {
		
		al.set(0, "git");
		al.set(2, "gud");
		
	}

}
