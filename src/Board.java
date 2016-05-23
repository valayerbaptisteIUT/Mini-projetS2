
/**
 * This class represents a chess board like this : http://www.echecs.club/wp-content/uploads/2015/11/regles-disposition.png 
 * @author valayerb 
 */
public class Board
{
	/**
	 * Constants for the size of the grid 
	 */
	// TODO fix comment(done)
	private final static int DEFAULT_size=8;
	/**
	 * a grid which represent the chessboard[0<line<8][0<column<8] 
	 */
	private Piece[][] grid;

	/**
	 * Create a new board, that contains number 1 for white pawns and 2 for black pawns at their initial locations
	 */
	public Board()
	{
		// TODO use constants for grid size(done)
		this.grid = new Piece[DEFAULT_size][DEFAULT_size];
		// TODO use constants for grid cell content(done)

		for(int index=0;index<2;index++)
		{
			for(int indexbis=0;indexbis<8;indexbis++)
			{
				//this.grid[indexbis][index]=pion blanc;
			}
		}
		for(int index=6;index<8;index++)
		{
			for(int indexbis=0;indexbis<8;indexbis++)
			{
				//this.grid[indexbis][index]=pion noir;
			}
		}
		
	}
	
	/** returns an ASCII-art representation of the board
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String ascii = " ABCDEFGH";

		for (int line=0;line<8;line++)
				{
					String row=""+line;
					for (int column=0;column<8;column++)
					{
						/*switch(this.grid[column][line])
						{
							//appeler toString de chaque piece
						}*/
					}
						
					System.out.println(row);
				}
			
		return ascii;
	}

	/**
	 * methode which try if a move is valid
	 * @param move
	 * @return boolean
	 */
	public boolean isMoveValid(Move move)
	{
		if (this.grid[move.getPosDepart().getPosX()][move.getPosDepart().getPosY()] == null)
		{
			//if(currentPlayer()){} retoune player
		}
		if (this.grid[move.getPosArrive().getPosX()][move.getPosArrive().getPosY()] == null)
		{
			
		}
		return true;
	}

	/**
	 * make the move
	 * @param move
	 */
	public void processMove(Move move)
	{
		// TODO to be completed
		
	}
}