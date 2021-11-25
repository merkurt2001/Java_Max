package assignment.assignment5_selectionStatements;

public class Question8 {

	public static void main(String[] args) {
		
		
		int player=10,house=7;
		
	    if (player+house>21){
	        System.out.println("bust");
	      }else if(player<house){
	        System.out.println("player loss");
	      }else if(player==house){
	        System.out.println("its a tie");
	      }else if(player>house){
	        System.out.println("player wins");
	      }

	}

}
