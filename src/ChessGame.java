/**
 * Class which represents a chess game
 * chess's rules : https://www.chess.com/learn-how-to-play-chess
 * @author valayerb
 * 
 */
public class ChessGame
{
	/**
	 * constant refer to white player
	 */
	private final static int WHITE_PLAYER_NUMBER = 0;
	/**
	 * constant refer to black player
	 */
	private final static int BLACK_PLAYER_NUMBER = 1;
	/**
	 * chess board
	 */
	private Board board;
	
	// TODO write comment(done)
	/**
	 * black player
	 */
	private Player blackPlayer;

	// TODO write comment(done)
	/**
	 * white player
	 */
	private Player whitePlayer;
	
	/**
	 * create a new Chess game, ready to be played 
	 * (the board contains pawns at their initial locations, black and white players are ready) 
	 */
	public ChessGame()
	{
		this.board = new Board();
		this.blackPlayer = new Player();
		this.whitePlayer = new Player();
	}


	/**
	 * plays the game 
	 * 
	 * <current player is white player>
	 * While (<game is not over>)
	 * {
	 *   Do
	 *   {
	 * 		<Ask the move of current player>
	 *   }
	 *	 While (<move isn't possible>)
	 * 	 <Process move>
	 *   <Switch current player>
	 * }
	 * 
	 */
	public void play()
	{
		int currentPlayerNumber = WHITE_PLAYER_NUMBER;
		
		while (!this.isGameFinished())
		{
			Player currentPlayer = this.whitePlayer;
			if (currentPlayerNumber == BLACK_PLAYER_NUMBER)
				currentPlayer = this.blackPlayer;
			
			System.out.println(this.board);
			
			Move move = null;
			while (true)
			{
				move = currentPlayer.askForMove();
				if (this.board.isMoveValid(move))
					break;
			}
			this.board.processMove(move);
			
			if (currentPlayerNumber == WHITE_PLAYER_NUMBER)
				currentPlayerNumber = BLACK_PLAYER_NUMBER;
			else
				currentPlayerNumber = WHITE_PLAYER_NUMBER;
			
		}
	}

	// TODO fix comment(done)
	/**
	 * Return game status (ended or not) 
	 * @return <tt>true</tt> if game is over, <tt>false</tt> if not
	 */
	private boolean isGameFinished()
	{
		return false;
	}
}