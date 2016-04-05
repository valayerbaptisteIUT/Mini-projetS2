
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
	 * Constants for cell content (White piece)
	 */
	private final static int DEFAULT_contentB=1;
	/**
	 * Constants for cell content (Black piece)
	 */
	private final static int DEFAULT_contentW=2;
	/**
	 * initialize of grid variable
	 */
	private int[][] grid;

	/**
	 * Create a new board, that contains number 1 for white pawns and 2 for black pawns at their initial locations
	 */
	public Board()
	{
		// TODO use constants for grid size(done)
		this.grid = new int[DEFAULT_size][DEFAULT_size];
		// TODO use constants for grid cell content(done)

		for(int index=0;index<2;index++)
		{
			for(int indexbis=0;indexbis<8;indexbis++)
			{
				this.grid[indexbis][index]=DEFAULT_contentW;
			}
		}
		for(int index=6;index<8;index++)
		{
			for(int indexbis=0;indexbis<8;indexbis++)
			{
				this.grid[indexbis][index]=DEFAULT_contentB;
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
						switch(this.grid[column][line])
						{
							case 1 :row=row+"B";
							break;
							case 2 :row=row+"W";
							break;
							default : row=row+" ";
						}
					}
						
					System.out.println(row);
				}
			
		return ascii;
	}

	public boolean isMoveValid(Move move)
	{
		// TODO to be completed
		return true;
	}

	public void processMove(Move move)
	{
		// TODO to be completed
		
	}
}