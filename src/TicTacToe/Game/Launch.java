package TicTacToe.Game;

public class Launch {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();

		HumanPlayer p1 = new HumanPlayer("Sesslyn", 'X');
		AIPlayer p2 = new AIPlayer("TAI",'O');
		Player cp;
		cp = p1;

		while (true) {
			System.out.println(cp.name + " goes first");
			cp.makeMove();
			TicTacToe.displayBoard();
			if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()) {
				System.out.println(cp.name + " has won");
				break;
			}
			else if(TicTacToe.checkDraw()){
				System.out.println("Game is a draw");
				break;
			}	
			else {
				if (cp == p1) {
					cp = p2;
				} else {
					cp = p1;
				}
			}
		}

	}
}
