
/**
 * This class represents a chess board like this : http://www.echecs.club/wp-content/uploads/2015/11/regles-disposition.png 
 * @author valayerb 
 */
public class Board
{
	// TODO fix comment(done)
	/**
	 * initialize of grid variable
	 */
	private int[][] grid;

	/**
	 * Create a new board, that contains number 1 for white pawns and 2 for black pawns at their initial locations
	 */
	public Board()
	{
		this.grid = new int[8][8];
		this.grid[0][0]=1;
		this.grid[1][0]=1;
		this.grid[2][0]=1;
		this.grid[3][0]=1;
		this.grid[4][0]=1;
		this.grid[5][0]=1;
		this.grid[6][0]=1;
		this.grid[7][0]=1;
		
		this.grid[0][7]=2;
		this.grid[1][7]=2;
		this.grid[2][7]=2;
		this.grid[3][7]=2;
		this.grid[4][7]=2;
		this.grid[5][7]=2;
		this.grid[6][7]=2;
		this.grid[7][7]=2;
		
	}
	
	/** returns an ASCII-art representation of the board
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String ascii = " ABCDEFGH\n";

		System.out.println(ascii);
		for (int line=0;line<8;line++)
				{
					String row=""+line;
					for (int column=0;column<8;column++)
					{
						if (this.grid[column][line] == 1)
						{row=row+"W";}
						if (this.grid[column][line] == 2)
						{row=row+"B";}
						
					}
					System.out.println(line);
				}
			
		return ascii;
	}
}
