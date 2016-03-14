/**
 * Class which represents a chess game
 * chess's rules : https://www.chess.com/learn-how-to-play-chess
 * @author valayerb
 * 
 */
public class ChessGame
{
	// TODO fix comment (this initializes nothing, it is something from Chess Game point-of-view
	/**
	 * initialize of the chess board variable
	 */
	private Board board;
	
	/**
	 * create a new Chess game, ready to be played (the board contains pawns at their initial locations) 
	 */
	public ChessGame()
	{
		this.board = new Board();
	}

	// TODO detail "each player can move one pawn by turn"
	// what information this method need and how this information is used to update game
	/**
	 * plays the game (while one player is not checkmate, each player can move one pawn by turn)
	 */
	public void play()
	{
		
	}
}