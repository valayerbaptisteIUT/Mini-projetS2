/**
 * Class which represents a chess game
 * chess's rules : https://www.chess.com/learn-how-to-play-chess
 * @author valayerb
 * 
 */
public class ChessGame
{
	// TODO fix comment (ask for advice)
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

	// TODO clean algorithm
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
			System.out.println(this.board);
			boolean moved = false;
			
			while(!moved)
			{
				//trymove(Piece piece0, int xpos, int ypos)
				//ask other move
			}
			//switch player
		}
	}

	// TODO fix comment
	/**
	 * Return game status (ended or not) 
	 * @return
	 */
	private boolean isGameFinished()
	{
		return false;
	}
}