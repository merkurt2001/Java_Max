package assignment.assignment8_methods;

public class Question17 {

	public static void main(String[] args) {
		
		System.out.println(getThunderBlazz(true,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,5,3));
	}
	
	public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 , int ingredient2, int ingredient3){
			    
		boolean getThunder;
		if(available == true){
			getThunder=true;
		}else if(gift == true){
			getThunder=true;
		}else{
			 if(ingredient2==(2*ingredient1) && (ingredient3==(3*ingredient1))){
				 getThunder=true;
			 }else if(ingredient3==(2*ingredient2) && (ingredient1==3*ingredient2)){
			     getThunder=true;
			 }else{
			     getThunder=false;
			 }
		}
		return getThunder;

	}
}
