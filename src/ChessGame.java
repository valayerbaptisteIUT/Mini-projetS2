/**
 * Class which represents a chess game
 * chess's rules : https://www.chess.com/learn-how-to-play-chess
 * @author valayerb
 * 
 */
public class ChessGame
{
	// TODO (done) fix comment (this initializes nothing, it is something from Chess Game point-of-view
	/**
	 * Create Board's variable
	 */
	private Board board;
	
	/**
	 * create a new Chess game, ready to be played (the board contains pawns at their initial locations) 
	 */
	public ChessGame()
	{
		this.board = new Board();
	}

	// TODO (done) detail "each player can move one pawn by turn"
	// what information this method need and how this information is used to update game
	/**
	 * plays the game (while one player is not checkmate, each player can move one pawn by turn)
	 * The method must known the player who play and his move to update the game.
	 * 
	 * While one player isn't checkmate
	 *  While the move isn't possible
	 * 		Ask the move of one player : if it is possible the method move the piece
	 * 									 else repeat
	 * 	End
	 * switch player
	 * End
	 * 
	 */
	public void play()
	{
		while (!this.isGameFinished())
		{
			boolean moved = false;
			
			while(!moved)
			{
				//if (...) moved = true;
			}
		}
	}

	/**
	 * Return the statut of the game if it's end (one player is checkmate or if only the king is alive each player or if one player surrender) or not 
	 * @return
	 */
	private boolean isGameFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}
}