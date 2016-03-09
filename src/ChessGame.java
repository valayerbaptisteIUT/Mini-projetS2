/**
 * Class which represents a chess game
 * chess's rules : https://www.chess.com/learn-how-to-play-chess
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
	 * create a new Chess game, ready to be played (the board contains the pawn at their initial locations) 
	 */
	public ChessGame()
	{
		this.board = new Board();
	}

	/**
	 * plays the game while one player is not checkmate, Each player can move one pawn by turn
	 */
	public void play()
	{
		
	}
}