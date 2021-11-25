package assignment.assignment12_mix;

import java.util.ArrayList;
import java.util.Arrays;

public class Question66 {

	public static void main(String[] args) 	{
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		System.out.println(appendPosSum(list).toString());
		
	}

	
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
	
		ArrayList<Integer> newList= new ArrayList<>();
		int sum=0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>0) {
				newList.add(list.get(i));
			}
		}
		
		for(int i=0;i<newList.size();i++) {
			sum=sum+newList.get(i);
		}
		
		newList.add(sum);
		
		return newList;
	}
	
		

}
