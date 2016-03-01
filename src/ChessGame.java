
/**
 * Class which represent the principal components necessary to play a chess game
 * @author valayerb
 * 
 */
public class ChessGame
{
	/**
	 * initialize of the chess board variable
	 */
	private Board board;
	/**
	 * initialize of the pawn variable
	 */
	private Pawn pawn;

	/**
	 * create a new Chess game in this initial state (the board contains the pawn at their initial locations) 
	 */
	public ChessGame()
	{
		this.pawn = new Pawn();
		this.board = new Board();
	}

	/**
	 * start the game, allow yourself to move pawns and end the game when a player is checkmate
	 */
	public void play()
	{
		
	}
}