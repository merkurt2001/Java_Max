package assignment.assignment12_mix;

import java.util.Arrays;

public class Question55 {

	public static void main(String[] args) {
		
	    String[][] chessBoard = new String[8][8];
	    String[] element= {"a","b","c","d","e","f","g","h"};
			
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				chessBoard[i][j]=(i+1)+element[j];
			}
		}
	    
		System.out.println(Arrays.deepToString(chessBoard));

	}

}
