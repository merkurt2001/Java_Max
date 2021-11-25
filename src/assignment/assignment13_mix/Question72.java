package assignment.assignment13_mix;

import java.util.ArrayList;

public class Question72 {

		public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
			
			int times;
			int sum=0;int j=0;
			
			for(Integer i:deliveries){
				sum=sum+i;
			}
	    
			times= sum/max_fuel+(sum%max_fuel);
			
			return times;
			
		}
	  
		public static void main(String[] args) {
	    
			ArrayList<Integer>  arr = new ArrayList<>();
			arr.add(11);
			arr.add(2);
			
			int times = refuel_times(arr,3);
			
			System.out.print(times);
			
		}
		
	

}
