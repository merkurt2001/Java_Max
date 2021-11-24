import java.util.Arrays;
import java.util.Iterator;

public class ChessBoard2D {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE
		for (int row = 0; row < chessBoard.length; row++) {
			for (char myChar = 'a'; myChar <= 'h'; myChar++) {
				int col = myChar - 97;
				chessBoard[row][col] = row + 1 + "" + myChar;
			}

		}

		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));
	}
}