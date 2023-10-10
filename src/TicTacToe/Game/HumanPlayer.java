package TicTacToe.Game;

import java.util.Scanner;

public class HumanPlayer extends Player{

	

	public HumanPlayer(String name, char mark) {
		super(name, mark);
	}

	@Override
	public void makeMove() {
		Scanner scan = new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter the row and col");
			row = scan.nextInt();
			col = scan.nextInt();
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}

	
}
