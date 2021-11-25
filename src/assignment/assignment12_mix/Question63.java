package assignment.assignment12_mix;

import java.util.ArrayList;

public class Question63 {

	public static void main(String[] args) {
		
		ArrayList<Double> arrList = new ArrayList<>();
		arrList.add(5.2);
		arrList.add(3.14);
		arrList.add(9.7);
		arrList.add(10.24);
		arrList.add(9.1);
		
		System.out.println(doubles(arrList));
		
	}
	
	public static ArrayList<Double> doubles(ArrayList<Double> al){
		
		al.remove(0);
		al.remove(0);
		
		return al;
		
	}

}
