
/**
 * Class which represent an application of a chess game
 * @author valayerb
 *
 */
public class ChessBoardApp
{

	/**
	 * Main which create a new chess game and start the game.
	 * @param args
	 */
	public static void main(String[] args)
	{
		ChessGame chessgame = new ChessGame();	//Create a new game
		new chessgame.playChess();
	}

}
